package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSOverviewResultInnerPayloadData;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSOverviewResultInnerPayload  {
  
  private Integer version;

  private String type;

  private String id;

  private String hash;

  private ARSOverviewResultInnerPayloadData data;
 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ARSOverviewResultInnerPayload version(Integer version) {
    this.version = version;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ARSOverviewResultInnerPayload type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ARSOverviewResultInnerPayload id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get hash
   * @return hash
  **/
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public ARSOverviewResultInnerPayload hash(String hash) {
    this.hash = hash;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public ARSOverviewResultInnerPayloadData getData() {
    return data;
  }

  public void setData(ARSOverviewResultInnerPayloadData data) {
    this.data = data;
  }

  public ARSOverviewResultInnerPayload data(ARSOverviewResultInnerPayloadData data) {
    this.data = data;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ARSOverviewResultInnerPayload arSOverviewResultInnerPayload = (ARSOverviewResultInnerPayload) o;
    return Objects.equals(version, arSOverviewResultInnerPayload.version) &&
        Objects.equals(type, arSOverviewResultInnerPayload.type) &&
        Objects.equals(id, arSOverviewResultInnerPayload.id) &&
        Objects.equals(hash, arSOverviewResultInnerPayload.hash) &&
        Objects.equals(data, arSOverviewResultInnerPayload.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, type, id, hash, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSOverviewResultInnerPayload {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

