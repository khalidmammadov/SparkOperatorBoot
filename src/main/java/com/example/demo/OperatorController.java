package com.example.demo;

import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplication;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationList;
import io.k8s.sparkoperator.v1beta2.models.V1beta2SparkApplication;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.Yaml;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OperatorController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @Autowired
    ApiClient apiClient;

    static {
        ModelMapper.addModelMap("sparkoperator.k8s.io",
                "v1beta2", "SparkApplication", "sparkapplications", true, V1beta2SparkApplication.class);
    }

    @RequestMapping(value = "/listpods", method = RequestMethod.GET)
    public String listPods() throws IOException, ApiException {
        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }
        return list.getItems().stream().map(item-> item.getMetadata().getNamespace().toString()+"  "+item.getMetadata().getName()+"\n").toList().toString();
    }

    @RequestMapping(value = "/runjob", method = RequestMethod.GET)
    public String runJob() throws IOException, ApiException, URISyntaxException {
        var yamlTemplate = new String(
                getClass()
                        .getClassLoader()
                        .getResourceAsStream("spark-pi-my.yaml")
                        .readAllBytes(), StandardCharsets.UTF_8
        );
        var suffix = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        var resolved = yamlTemplate.replace("<APP_NAME>", "spark-pi-"+suffix );
        System.out.println(resolved);
        var sparkApp = (V1beta2SparkApplication) Yaml.load(resolved);

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);

        try {
            Object res = customObjectsApi.createNamespacedCustomObject(
                    "sparkoperator.k8s.io",
                    "v1beta2",
                    "default",
                    "sparkapplications",
                    sparkApp,
                    "true",
                    null,
                    null
            );
            return res.toString();
//            var api = new GenericKubernetesApi<>(V1beta2SparkApplication.class, V1beta2ScheduledSparkApplicationList.class,
//                    "sparkoperator.k8s.io", "v1beta2",
//                    "sparkapplications", apiClient);
//            System.out.println(api.list("default").getObject());
//            KubernetesApiResponse<V1beta2SparkApplication> res =
//                    api
//                            .create(sparkApp)
//                            .throwsApiException();
        } catch (ApiException e) {
            return String.format("%s %s %s",
                    e.getMessage(), e.getCode(), e.getResponseBody());
        }

    }

}
