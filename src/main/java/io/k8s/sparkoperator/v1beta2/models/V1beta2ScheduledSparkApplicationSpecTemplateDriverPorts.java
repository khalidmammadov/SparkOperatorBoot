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
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts {
  public static final String SERIALIZED_NAME_CONTAINER_PORT = "containerPort";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PORT)
  private Integer containerPort;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";
  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  private String hostIP;

  public static final String SERIALIZED_NAME_HOST_PORT = "hostPort";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private Integer hostPort;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts containerPort(Integer containerPort) {
    
    this.containerPort = containerPort;
    return this;
  }

   /**
   * Get containerPort
   * @return containerPort
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getContainerPort() {
    return containerPort;
  }


  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts hostIP(String hostIP) {
    
    this.hostIP = hostIP;
    return this;
  }

   /**
   * Get hostIP
   * @return hostIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostIP() {
    return hostIP;
  }


  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts hostPort(Integer hostPort) {
    
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostPort() {
    return hostPort;
  }


  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts = (V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts) o;
    return Objects.equals(this.containerPort, v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts.containerPort) &&
        Objects.equals(this.hostIP, v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts.hostIP) &&
        Objects.equals(this.hostPort, v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts.hostPort) &&
        Objects.equals(this.name, v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts.name) &&
        Objects.equals(this.protocol, v1beta2ScheduledSparkApplicationSpecTemplateDriverPorts.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverPorts {\n");
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

