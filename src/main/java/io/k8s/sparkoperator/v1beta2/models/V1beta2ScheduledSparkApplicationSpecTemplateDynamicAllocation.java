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
 * V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INITIAL_EXECUTORS = "initialExecutors";
  @SerializedName(SERIALIZED_NAME_INITIAL_EXECUTORS)
  private Integer initialExecutors;

  public static final String SERIALIZED_NAME_MAX_EXECUTORS = "maxExecutors";
  @SerializedName(SERIALIZED_NAME_MAX_EXECUTORS)
  private Integer maxExecutors;

  public static final String SERIALIZED_NAME_MIN_EXECUTORS = "minExecutors";
  @SerializedName(SERIALIZED_NAME_MIN_EXECUTORS)
  private Integer minExecutors;

  public static final String SERIALIZED_NAME_SHUFFLE_TRACKING_TIMEOUT = "shuffleTrackingTimeout";
  @SerializedName(SERIALIZED_NAME_SHUFFLE_TRACKING_TIMEOUT)
  private Long shuffleTrackingTimeout;


  public V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation initialExecutors(Integer initialExecutors) {
    
    this.initialExecutors = initialExecutors;
    return this;
  }

   /**
   * Get initialExecutors
   * @return initialExecutors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInitialExecutors() {
    return initialExecutors;
  }


  public void setInitialExecutors(Integer initialExecutors) {
    this.initialExecutors = initialExecutors;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation maxExecutors(Integer maxExecutors) {
    
    this.maxExecutors = maxExecutors;
    return this;
  }

   /**
   * Get maxExecutors
   * @return maxExecutors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxExecutors() {
    return maxExecutors;
  }


  public void setMaxExecutors(Integer maxExecutors) {
    this.maxExecutors = maxExecutors;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation minExecutors(Integer minExecutors) {
    
    this.minExecutors = minExecutors;
    return this;
  }

   /**
   * Get minExecutors
   * @return minExecutors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinExecutors() {
    return minExecutors;
  }


  public void setMinExecutors(Integer minExecutors) {
    this.minExecutors = minExecutors;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation shuffleTrackingTimeout(Long shuffleTrackingTimeout) {
    
    this.shuffleTrackingTimeout = shuffleTrackingTimeout;
    return this;
  }

   /**
   * Get shuffleTrackingTimeout
   * @return shuffleTrackingTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getShuffleTrackingTimeout() {
    return shuffleTrackingTimeout;
  }


  public void setShuffleTrackingTimeout(Long shuffleTrackingTimeout) {
    this.shuffleTrackingTimeout = shuffleTrackingTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation = (V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation) o;
    return Objects.equals(this.enabled, v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation.enabled) &&
        Objects.equals(this.initialExecutors, v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation.initialExecutors) &&
        Objects.equals(this.maxExecutors, v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation.maxExecutors) &&
        Objects.equals(this.minExecutors, v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation.minExecutors) &&
        Objects.equals(this.shuffleTrackingTimeout, v1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation.shuffleTrackingTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, initialExecutors, maxExecutors, minExecutors, shuffleTrackingTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDynamicAllocation {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    initialExecutors: ").append(toIndentedString(initialExecutors)).append("\n");
    sb.append("    maxExecutors: ").append(toIndentedString(maxExecutors)).append("\n");
    sb.append("    minExecutors: ").append(toIndentedString(minExecutors)).append("\n");
    sb.append("    shuffleTrackingTimeout: ").append(toIndentedString(shuffleTrackingTimeout)).append("\n");
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

