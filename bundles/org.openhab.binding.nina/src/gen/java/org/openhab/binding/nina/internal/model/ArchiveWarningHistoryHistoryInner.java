package org.openhab.binding.nina.internal.model;

import java.util.Date;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArchiveWarningHistoryHistoryInner  {
  
  private String identifier;

  private String msgType;

  private Date sent;

  private String headline;
 /**
   * Get identifier
   * @return identifier
  **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ArchiveWarningHistoryHistoryInner identifier(String identifier) {
    this.identifier = identifier;
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

  public ArchiveWarningHistoryHistoryInner msgType(String msgType) {
    this.msgType = msgType;
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

  public ArchiveWarningHistoryHistoryInner sent(Date sent) {
    this.sent = sent;
    return this;
  }

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

  public ArchiveWarningHistoryHistoryInner headline(String headline) {
    this.headline = headline;
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
    ArchiveWarningHistoryHistoryInner archiveWarningHistoryHistoryInner = (ArchiveWarningHistoryHistoryInner) o;
    return Objects.equals(identifier, archiveWarningHistoryHistoryInner.identifier) &&
        Objects.equals(msgType, archiveWarningHistoryHistoryInner.msgType) &&
        Objects.equals(sent, archiveWarningHistoryHistoryInner.sent) &&
        Objects.equals(headline, archiveWarningHistoryHistoryInner.headline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, msgType, sent, headline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveWarningHistoryHistoryInner {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
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

