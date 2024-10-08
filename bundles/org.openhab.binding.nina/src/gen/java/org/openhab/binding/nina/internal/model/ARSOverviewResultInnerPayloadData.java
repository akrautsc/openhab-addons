package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSOverviewResultInnerPayloadDataArea;
import org.openhab.binding.nina.internal.model.ARSOverviewResultInnerPayloadDataTransKeys;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSOverviewResultInnerPayloadData  {
  
  private String headline;

  private String provider;

  private String severity;

  private String msgType;

  private ARSOverviewResultInnerPayloadDataTransKeys transKeys;

  private ARSOverviewResultInnerPayloadDataArea area;
 /**
   * Get headline
   * @return headline
  **/
  @JsonProperty("headline")
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public ARSOverviewResultInnerPayloadData headline(String headline) {
    this.headline = headline;
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ARSOverviewResultInnerPayloadData provider(String provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Get severity
   * @return severity
  **/
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public ARSOverviewResultInnerPayloadData severity(String severity) {
    this.severity = severity;
    return this;
  }

 /**
   * Get msgType
   * @return msgType
  **/
  @JsonProperty("msgType")
  public String getMsgType() {
    return msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public ARSOverviewResultInnerPayloadData msgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

 /**
   * Get transKeys
   * @return transKeys
  **/
  @JsonProperty("transKeys")
  public ARSOverviewResultInnerPayloadDataTransKeys getTransKeys() {
    return transKeys;
  }

  public void setTransKeys(ARSOverviewResultInnerPayloadDataTransKeys transKeys) {
    this.transKeys = transKeys;
  }

  public ARSOverviewResultInnerPayloadData transKeys(ARSOverviewResultInnerPayloadDataTransKeys transKeys) {
    this.transKeys = transKeys;
    return this;
  }

 /**
   * Get area
   * @return area
  **/
  @JsonProperty("area")
  public ARSOverviewResultInnerPayloadDataArea getArea() {
    return area;
  }

  public void setArea(ARSOverviewResultInnerPayloadDataArea area) {
    this.area = area;
  }

  public ARSOverviewResultInnerPayloadData area(ARSOverviewResultInnerPayloadDataArea area) {
    this.area = area;
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
    ARSOverviewResultInnerPayloadData arSOverviewResultInnerPayloadData = (ARSOverviewResultInnerPayloadData) o;
    return Objects.equals(headline, arSOverviewResultInnerPayloadData.headline) &&
        Objects.equals(provider, arSOverviewResultInnerPayloadData.provider) &&
        Objects.equals(severity, arSOverviewResultInnerPayloadData.severity) &&
        Objects.equals(msgType, arSOverviewResultInnerPayloadData.msgType) &&
        Objects.equals(transKeys, arSOverviewResultInnerPayloadData.transKeys) &&
        Objects.equals(area, arSOverviewResultInnerPayloadData.area);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, provider, severity, msgType, transKeys, area);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSOverviewResultInnerPayloadData {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    transKeys: ").append(toIndentedString(transKeys)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
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

