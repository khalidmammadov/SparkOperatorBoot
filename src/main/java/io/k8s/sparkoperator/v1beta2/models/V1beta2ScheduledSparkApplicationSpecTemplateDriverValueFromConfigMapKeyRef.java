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
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef key(String key) {
    
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


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef name(String name) {
    
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


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef v1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef = (V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef) o;
    return Objects.equals(this.key, v1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef.key) &&
        Objects.equals(this.name, v1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef.name) &&
        Objects.equals(this.optional, v1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverValueFromConfigMapKeyRef {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
