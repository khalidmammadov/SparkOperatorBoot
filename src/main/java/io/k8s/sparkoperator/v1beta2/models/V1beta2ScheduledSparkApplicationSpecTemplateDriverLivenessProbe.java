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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartExec;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGet;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartTcpSocket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe {
  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartExec exec;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";
  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";
  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGet httpGet;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_SUCCESS_THRESHOLD = "successThreshold";
  @SerializedName(SERIALIZED_NAME_SUCCESS_THRESHOLD)
  private Integer successThreshold;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";
  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartTcpSocket tcpSocket;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe exec(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartExec exec) {
    
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartExec getExec() {
    return exec;
  }


  public void setExec(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartExec exec) {
    this.exec = exec;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe failureThreshold(Integer failureThreshold) {
    
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Get failureThreshold
   * @return failureThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailureThreshold() {
    return failureThreshold;
  }


  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe httpGet(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGet httpGet) {
    
    this.httpGet = httpGet;
    return this;
  }

   /**
   * Get httpGet
   * @return httpGet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGet getHttpGet() {
    return httpGet;
  }


  public void setHttpGet(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe initialDelaySeconds(Integer initialDelaySeconds) {
    
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Get initialDelaySeconds
   * @return initialDelaySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }


  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe periodSeconds(Integer periodSeconds) {
    
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * Get periodSeconds
   * @return periodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPeriodSeconds() {
    return periodSeconds;
  }


  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe successThreshold(Integer successThreshold) {
    
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Get successThreshold
   * @return successThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessThreshold() {
    return successThreshold;
  }


  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe tcpSocket(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartTcpSocket tcpSocket) {
    
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Get tcpSocket
   * @return tcpSocket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartTcpSocket getTcpSocket() {
    return tcpSocket;
  }


  public void setTcpSocket(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartTcpSocket tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe = (V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe) o;
    return Objects.equals(this.exec, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.exec) &&
        Objects.equals(this.failureThreshold, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.failureThreshold) &&
        Objects.equals(this.httpGet, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.httpGet) &&
        Objects.equals(this.initialDelaySeconds, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.periodSeconds) &&
        Objects.equals(this.successThreshold, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.successThreshold) &&
        Objects.equals(this.tcpSocket, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.tcpSocket) &&
        Objects.equals(this.timeoutSeconds, v1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverLivenessProbe {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

