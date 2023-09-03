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
 * V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_PD_NAME = "pdName";
  @SerializedName(SERIALIZED_NAME_PD_NAME)
  private String pdName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;


  public V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Get fsType
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition() {
    return partition;
  }


  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk pdName(String pdName) {
    
    this.pdName = pdName;
    return this;
  }

   /**
   * Get pdName
   * @return pdName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPdName() {
    return pdName;
  }


  public void setPdName(String pdName) {
    this.pdName = pdName;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk readOnly(Boolean readOnly) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk v1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk = (V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk) o;
    return Objects.equals(this.fsType, v1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk.fsType) &&
        Objects.equals(this.partition, v1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk.partition) &&
        Objects.equals(this.pdName, v1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk.pdName) &&
        Objects.equals(this.readOnly, v1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, pdName, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateGcePersistentDisk {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    pdName: ").append(toIndentedString(pdName)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

