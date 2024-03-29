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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextSeLinuxOptions;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextWindowsOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext {
  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";
  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  private Long fsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_GROUP = "runAsGroup";
  @SerializedName(SERIALIZED_NAME_RUN_AS_GROUP)
  private Long runAsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_NON_ROOT = "runAsNonRoot";
  @SerializedName(SERIALIZED_NAME_RUN_AS_NON_ROOT)
  private Boolean runAsNonRoot;

  public static final String SERIALIZED_NAME_RUN_AS_USER = "runAsUser";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER)
  private Long runAsUser;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextSeLinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private List<Long> supplementalGroups = null;

  public static final String SERIALIZED_NAME_SYSCTLS = "sysctls";
  @SerializedName(SERIALIZED_NAME_SYSCTLS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders> sysctls = null;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";
  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextWindowsOptions windowsOptions;


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext fsGroup(Long fsGroup) {
    
    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * Get fsGroup
   * @return fsGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFsGroup() {
    return fsGroup;
  }


  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext runAsGroup(Long runAsGroup) {
    
    this.runAsGroup = runAsGroup;
    return this;
  }

   /**
   * Get runAsGroup
   * @return runAsGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunAsGroup() {
    return runAsGroup;
  }


  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

   /**
   * Get runAsNonRoot
   * @return runAsNonRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }


  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext runAsUser(Long runAsUser) {
    
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * Get runAsUser
   * @return runAsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunAsUser() {
    return runAsUser;
  }


  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext seLinuxOptions(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextSeLinuxOptions seLinuxOptions) {
    
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * Get seLinuxOptions
   * @return seLinuxOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextSeLinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }


  public void setSeLinuxOptions(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextSeLinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

   /**
   * Get supplementalGroups
   * @return supplementalGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }


  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext sysctls(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders> sysctls) {
    
    this.sysctls = sysctls;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext addSysctlsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

   /**
   * Get sysctls
   * @return sysctls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders> getSysctls() {
    return sysctls;
  }


  public void setSysctls(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverLifecyclePostStartHttpGetHttpHeaders> sysctls) {
    this.sysctls = sysctls;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext windowsOptions(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextWindowsOptions windowsOptions) {
    
    this.windowsOptions = windowsOptions;
    return this;
  }

   /**
   * Get windowsOptions
   * @return windowsOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextWindowsOptions getWindowsOptions() {
    return windowsOptions;
  }


  public void setWindowsOptions(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContextWindowsOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext = (V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext) o;
    return Objects.equals(this.fsGroup, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.fsGroup) &&
        Objects.equals(this.runAsGroup, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.runAsGroup) &&
        Objects.equals(this.runAsNonRoot, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxOptions, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.seLinuxOptions) &&
        Objects.equals(this.supplementalGroups, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.supplementalGroups) &&
        Objects.equals(this.sysctls, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.sysctls) &&
        Objects.equals(this.windowsOptions, v1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsGroup, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, supplementalGroups, sysctls, windowsOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext {\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
    sb.append("    windowsOptions: ").append(toIndentedString(windowsOptions)).append("\n");
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

