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
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SECRET_TYPE = "secretType";
  @SerializedName(SERIALIZED_NAME_SECRET_TYPE)
  private String secretType;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets name(String name) {
    
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


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets path(String path) {
    
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


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets secretType(String secretType) {
    
    this.secretType = secretType;
    return this;
  }

   /**
   * Get secretType
   * @return secretType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSecretType() {
    return secretType;
  }


  public void setSecretType(String secretType) {
    this.secretType = secretType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets v1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets = (V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets) o;
    return Objects.equals(this.name, v1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets.name) &&
        Objects.equals(this.path, v1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets.path) &&
        Objects.equals(this.secretType, v1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets.secretType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, secretType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
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

