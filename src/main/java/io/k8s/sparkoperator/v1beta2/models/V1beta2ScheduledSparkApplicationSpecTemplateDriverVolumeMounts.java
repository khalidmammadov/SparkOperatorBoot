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

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";
  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";
  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  private String subPathExpr;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts mountPath(String mountPath) {
    
    this.mountPath = mountPath;
    return this;
  }

   /**
   * Get mountPath
   * @return mountPath
  **/
  @ApiModelProperty(required = true, value = "")

  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts mountPropagation(String mountPropagation) {
    
    this.mountPropagation = mountPropagation;
    return this;
  }

   /**
   * Get mountPropagation
   * @return mountPropagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMountPropagation() {
    return mountPropagation;
  }


  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * Get subPath
   * @return subPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts subPathExpr(String subPathExpr) {
    
    this.subPathExpr = subPathExpr;
    return this;
  }

   /**
   * Get subPathExpr
   * @return subPathExpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubPathExpr() {
    return subPathExpr;
  }


  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts = (V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts) o;
    return Objects.equals(this.mountPath, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.mountPath) &&
        Objects.equals(this.mountPropagation, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.mountPropagation) &&
        Objects.equals(this.name, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.name) &&
        Objects.equals(this.readOnly, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.readOnly) &&
        Objects.equals(this.subPath, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.subPath) &&
        Objects.equals(this.subPathExpr, v1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, subPath, subPathExpr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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

