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
 * V1beta2SparkApplicationStatusDriverInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2SparkApplicationStatusDriverInfo {
  public static final String SERIALIZED_NAME_POD_NAME = "podName";
  @SerializedName(SERIALIZED_NAME_POD_NAME)
  private String podName;

  public static final String SERIALIZED_NAME_WEB_U_I_ADDRESS = "webUIAddress";
  @SerializedName(SERIALIZED_NAME_WEB_U_I_ADDRESS)
  private String webUIAddress;

  public static final String SERIALIZED_NAME_WEB_U_I_INGRESS_ADDRESS = "webUIIngressAddress";
  @SerializedName(SERIALIZED_NAME_WEB_U_I_INGRESS_ADDRESS)
  private String webUIIngressAddress;

  public static final String SERIALIZED_NAME_WEB_U_I_INGRESS_NAME = "webUIIngressName";
  @SerializedName(SERIALIZED_NAME_WEB_U_I_INGRESS_NAME)
  private String webUIIngressName;

  public static final String SERIALIZED_NAME_WEB_U_I_PORT = "webUIPort";
  @SerializedName(SERIALIZED_NAME_WEB_U_I_PORT)
  private Integer webUIPort;

  public static final String SERIALIZED_NAME_WEB_U_I_SERVICE_NAME = "webUIServiceName";
  @SerializedName(SERIALIZED_NAME_WEB_U_I_SERVICE_NAME)
  private String webUIServiceName;


  public V1beta2SparkApplicationStatusDriverInfo podName(String podName) {
    
    this.podName = podName;
    return this;
  }

   /**
   * Get podName
   * @return podName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPodName() {
    return podName;
  }


  public void setPodName(String podName) {
    this.podName = podName;
  }


  public V1beta2SparkApplicationStatusDriverInfo webUIAddress(String webUIAddress) {
    
    this.webUIAddress = webUIAddress;
    return this;
  }

   /**
   * Get webUIAddress
   * @return webUIAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebUIAddress() {
    return webUIAddress;
  }


  public void setWebUIAddress(String webUIAddress) {
    this.webUIAddress = webUIAddress;
  }


  public V1beta2SparkApplicationStatusDriverInfo webUIIngressAddress(String webUIIngressAddress) {
    
    this.webUIIngressAddress = webUIIngressAddress;
    return this;
  }

   /**
   * Get webUIIngressAddress
   * @return webUIIngressAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebUIIngressAddress() {
    return webUIIngressAddress;
  }


  public void setWebUIIngressAddress(String webUIIngressAddress) {
    this.webUIIngressAddress = webUIIngressAddress;
  }


  public V1beta2SparkApplicationStatusDriverInfo webUIIngressName(String webUIIngressName) {
    
    this.webUIIngressName = webUIIngressName;
    return this;
  }

   /**
   * Get webUIIngressName
   * @return webUIIngressName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebUIIngressName() {
    return webUIIngressName;
  }


  public void setWebUIIngressName(String webUIIngressName) {
    this.webUIIngressName = webUIIngressName;
  }


  public V1beta2SparkApplicationStatusDriverInfo webUIPort(Integer webUIPort) {
    
    this.webUIPort = webUIPort;
    return this;
  }

   /**
   * Get webUIPort
   * @return webUIPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWebUIPort() {
    return webUIPort;
  }


  public void setWebUIPort(Integer webUIPort) {
    this.webUIPort = webUIPort;
  }


  public V1beta2SparkApplicationStatusDriverInfo webUIServiceName(String webUIServiceName) {
    
    this.webUIServiceName = webUIServiceName;
    return this;
  }

   /**
   * Get webUIServiceName
   * @return webUIServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebUIServiceName() {
    return webUIServiceName;
  }


  public void setWebUIServiceName(String webUIServiceName) {
    this.webUIServiceName = webUIServiceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2SparkApplicationStatusDriverInfo v1beta2SparkApplicationStatusDriverInfo = (V1beta2SparkApplicationStatusDriverInfo) o;
    return Objects.equals(this.podName, v1beta2SparkApplicationStatusDriverInfo.podName) &&
        Objects.equals(this.webUIAddress, v1beta2SparkApplicationStatusDriverInfo.webUIAddress) &&
        Objects.equals(this.webUIIngressAddress, v1beta2SparkApplicationStatusDriverInfo.webUIIngressAddress) &&
        Objects.equals(this.webUIIngressName, v1beta2SparkApplicationStatusDriverInfo.webUIIngressName) &&
        Objects.equals(this.webUIPort, v1beta2SparkApplicationStatusDriverInfo.webUIPort) &&
        Objects.equals(this.webUIServiceName, v1beta2SparkApplicationStatusDriverInfo.webUIServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podName, webUIAddress, webUIIngressAddress, webUIIngressName, webUIPort, webUIServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2SparkApplicationStatusDriverInfo {\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    webUIAddress: ").append(toIndentedString(webUIAddress)).append("\n");
    sb.append("    webUIIngressAddress: ").append(toIndentedString(webUIIngressAddress)).append("\n");
    sb.append("    webUIIngressName: ").append(toIndentedString(webUIIngressName)).append("\n");
    sb.append("    webUIPort: ").append(toIndentedString(webUIPort)).append("\n");
    sb.append("    webUIServiceName: ").append(toIndentedString(webUIServiceName)).append("\n");
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

