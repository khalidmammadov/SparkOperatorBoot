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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions = (V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions) o;
    return Objects.equals(this.key, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions.key) &&
        Objects.equals(this.operator, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions.operator) &&
        Objects.equals(this.values, v1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinityNodeAffinityPreferenceMatchExpressions {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

