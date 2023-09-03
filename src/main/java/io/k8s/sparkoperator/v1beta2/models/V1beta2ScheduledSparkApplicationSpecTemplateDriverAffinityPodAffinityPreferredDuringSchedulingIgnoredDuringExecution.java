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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution podAffinityTerm(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
    
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Get podAffinityTerm
   * @return podAffinityTerm
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }


  public void setPodAffinityTerm(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution = (V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(this.podAffinityTerm, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.podAffinityTerm) &&
        Objects.equals(this.weight, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

