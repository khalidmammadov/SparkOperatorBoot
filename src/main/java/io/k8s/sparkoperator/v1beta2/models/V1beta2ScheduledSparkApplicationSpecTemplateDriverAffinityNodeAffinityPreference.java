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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_FIELDS = "matchFields";
  @SerializedName(SERIALIZED_NAME_MATCH_FIELDS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchFields = null;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference matchExpressions(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference addMatchExpressionsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * Get matchExpressions
   * @return matchExpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference matchFields(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchFields) {
    
    this.matchFields = matchFields;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference addMatchFieldsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList<>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

   /**
   * Get matchFields
   * @return matchFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> getMatchFields() {
    return matchFields;
  }


  public void setMatchFields(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions> matchFields) {
    this.matchFields = matchFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference = (V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference) o;
    return Objects.equals(this.matchExpressions, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference.matchExpressions) &&
        Objects.equals(this.matchFields, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference.matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreference {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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

