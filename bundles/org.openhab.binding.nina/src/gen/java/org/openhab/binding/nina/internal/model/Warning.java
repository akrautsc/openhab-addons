package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openhab.binding.nina.internal.model.WarningInfoInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Warning  {
  
  private String identifier;

 /**
   * Sender-ID, passende logos können über /appdata/gsb/logos/logos.json abgerufen werden
  **/
  private String sender;

  private Date sent;

  private String status;

  private String msgType;

  private String scope;

  private List<String> code;

  private String incidents;

  private List<WarningInfoInner> info;
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

  public Warning identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

 /**
   * Sender-ID, passende logos können über /appdata/gsb/logos/logos.json abgerufen werden
   * @return sender
  **/
  @JsonProperty("sender")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Warning sender(String sender) {
    this.sender = sender;
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

  public Warning sent(Date sent) {
    this.sent = sent;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Warning status(String status) {
    this.status = status;
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

  public Warning msgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Warning scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public List<String> getCode() {
    return code;
  }

  public void setCode(List<String> code) {
    this.code = code;
  }

  public Warning code(List<String> code) {
    this.code = code;
    return this;
  }

  public Warning addCodeItem(String codeItem) {
    this.code.add(codeItem);
    return this;
  }

 /**
   * Get incidents
   * @return incidents
  **/
  @JsonProperty("incidents")
  public String getIncidents() {
    return incidents;
  }

  public void setIncidents(String incidents) {
    this.incidents = incidents;
  }

  public Warning incidents(String incidents) {
    this.incidents = incidents;
    return this;
  }

 /**
   * Get info
   * @return info
  **/
  @JsonProperty("info")
  public List<WarningInfoInner> getInfo() {
    return info;
  }

  public void setInfo(List<WarningInfoInner> info) {
    this.info = info;
  }

  public Warning info(List<WarningInfoInner> info) {
    this.info = info;
    return this;
  }

  public Warning addInfoItem(WarningInfoInner infoItem) {
    this.info.add(infoItem);
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
    Warning warning = (Warning) o;
    return Objects.equals(identifier, warning.identifier) &&
        Objects.equals(sender, warning.sender) &&
        Objects.equals(sent, warning.sent) &&
        Objects.equals(status, warning.status) &&
        Objects.equals(msgType, warning.msgType) &&
        Objects.equals(scope, warning.scope) &&
        Objects.equals(code, warning.code) &&
        Objects.equals(incidents, warning.incidents) &&
        Objects.equals(info, warning.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, sender, sent, status, msgType, scope, code, incidents, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

