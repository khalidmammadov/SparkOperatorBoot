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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromFieldRef;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromResourceFieldRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromResourceFieldRef resourceFieldRef;


  public V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems fieldRef(V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems resourceFieldRef(V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromResourceFieldRef resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems v1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems = (V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems) o;
    return Objects.equals(this.fieldRef, v1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems.fieldRef) &&
        Objects.equals(this.mode, v1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems.mode) &&
        Objects.equals(this.path, v1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems.path) &&
        Objects.equals(this.resourceFieldRef, v1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDownwardAPIItems {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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

