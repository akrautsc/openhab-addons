package org.openhab.binding.nina.internal.model;

import java.util.Date;
import org.openhab.binding.nina.internal.model.ARSOverviewResultInnerI18nTitle;
import org.openhab.binding.nina.internal.model.ARSOverviewResultInnerPayload;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSOverviewResultInner  {
  
  private String id;

  private ARSOverviewResultInnerPayload payload;

  private ARSOverviewResultInnerI18nTitle i18nTitle;

  private Date sent;
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

  public ARSOverviewResultInner id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get payload
   * @return payload
  **/
  @JsonProperty("payload")
  public ARSOverviewResultInnerPayload getPayload() {
    return payload;
  }

  public void setPayload(ARSOverviewResultInnerPayload payload) {
    this.payload = payload;
  }

  public ARSOverviewResultInner payload(ARSOverviewResultInnerPayload payload) {
    this.payload = payload;
    return this;
  }

 /**
   * Get i18nTitle
   * @return i18nTitle
  **/
  @JsonProperty("i18nTitle")
  public ARSOverviewResultInnerI18nTitle getI18nTitle() {
    return i18nTitle;
  }

  public void setI18nTitle(ARSOverviewResultInnerI18nTitle i18nTitle) {
    this.i18nTitle = i18nTitle;
  }

  public ARSOverviewResultInner i18nTitle(ARSOverviewResultInnerI18nTitle i18nTitle) {
    this.i18nTitle = i18nTitle;
    return this;
  }

 /**
   * Get sent
   * @return sent
  **/
  @JsonProperty("sent")
  public Date getSent() {
    return sent;
  }

  public void setSent(Date sent) {
    this.sent = sent;
  }

  public ARSOverviewResultInner sent(Date sent) {
    this.sent = sent;
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
    ARSOverviewResultInner arSOverviewResultInner = (ARSOverviewResultInner) o;
    return Objects.equals(id, arSOverviewResultInner.id) &&
        Objects.equals(payload, arSOverviewResultInner.payload) &&
        Objects.equals(i18nTitle, arSOverviewResultInner.i18nTitle) &&
        Objects.equals(sent, arSOverviewResultInner.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, payload, i18nTitle, sent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSOverviewResultInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    i18nTitle: ").append(toIndentedString(i18nTitle)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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

