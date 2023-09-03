/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.22.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.k8s.sparkoperator.v1beta2.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTermLabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTermLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm labelSelector(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTermLabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm namespaces(List<String> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm topologyKey(String topologyKey) {
    
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * Get topologyKey
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm = (V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm) o;
    return Objects.equals(this.labelSelector, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm.labelSelector) &&
        Objects.equals(this.namespaces, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm.namespaces) &&
        Objects.equals(this.topologyKey, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaces, topologyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
