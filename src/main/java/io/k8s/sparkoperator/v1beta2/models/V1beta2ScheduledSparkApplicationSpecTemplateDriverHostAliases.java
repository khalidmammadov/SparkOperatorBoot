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
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = null;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases hostnames(List<String> hostnames) {
    
    this.hostnames = hostnames;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases v1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases = (V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases) o;
    return Objects.equals(this.hostnames, v1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases.hostnames) &&
        Objects.equals(this.ip, v1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

