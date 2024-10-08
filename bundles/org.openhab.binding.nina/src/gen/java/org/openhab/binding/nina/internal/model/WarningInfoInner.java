package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openhab.binding.nina.internal.model.KeyValueArrayInner;
import org.openhab.binding.nina.internal.model.WarningInfoInnerAreaInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WarningInfoInner  {
  
  private List<String> category;

  private String event;

  private String urgency;

  private String severity;

  private String certainty;

  private List<KeyValueArrayInner> eventCode;

  private Date effective;

  private String senderName;

  private String headline;

  private String description;

  private String web;

  private List<KeyValueArrayInner> parameter;

  private List<WarningInfoInnerAreaInner> area;
 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public List<String> getCategory() {
    return category;
  }

  public void setCategory(List<String> category) {
    this.category = category;
  }

  public WarningInfoInner category(List<String> category) {
    this.category = category;
    return this;
  }

  public WarningInfoInner addCategoryItem(String categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public WarningInfoInner event(String event) {
    this.event = event;
    return this;
  }

 /**
   * Get urgency
   * @return urgency
  **/
  @JsonProperty("urgency")
  public String getUrgency() {
    return urgency;
  }

  public void setUrgency(String urgency) {
    this.urgency = urgency;
  }

  public WarningInfoInner urgency(String urgency) {
    this.urgency = urgency;
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

  public WarningInfoInner severity(String severity) {
    this.severity = severity;
    return this;
  }

 /**
   * Get certainty
   * @return certainty
  **/
  @JsonProperty("certainty")
  public String getCertainty() {
    return certainty;
  }

  public void setCertainty(String certainty) {
    this.certainty = certainty;
  }

  public WarningInfoInner certainty(String certainty) {
    this.certainty = certainty;
    return this;
  }

 /**
   * Get eventCode
   * @return eventCode
  **/
  @JsonProperty("eventCode")
  public List<KeyValueArrayInner> getEventCode() {
    return eventCode;
  }

  public void setEventCode(List<KeyValueArrayInner> eventCode) {
    this.eventCode = eventCode;
  }

  public WarningInfoInner eventCode(List<KeyValueArrayInner> eventCode) {
    this.eventCode = eventCode;
    return this;
  }

  public WarningInfoInner addEventCodeItem(KeyValueArrayInner eventCodeItem) {
    this.eventCode.add(eventCodeItem);
    return this;
  }

 /**
   * Get effective
   * @return effective
  **/
  @JsonProperty("effective")
  public Date getEffective() {
    return effective;
  }

  public void setEffective(Date effective) {
    this.effective = effective;
  }

  public WarningInfoInner effective(Date effective) {
    this.effective = effective;
    return this;
  }

 /**
   * Get senderName
   * @return senderName
  **/
  @JsonProperty("senderName")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public WarningInfoInner senderName(String senderName) {
    this.senderName = senderName;
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

  public WarningInfoInner headline(String headline) {
    this.headline = headline;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WarningInfoInner description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public WarningInfoInner web(String web) {
    this.web = web;
    return this;
  }

 /**
   * Get parameter
   * @return parameter
  **/
  @JsonProperty("parameter")
  public List<KeyValueArrayInner> getParameter() {
    return parameter;
  }

  public void setParameter(List<KeyValueArrayInner> parameter) {
    this.parameter = parameter;
  }

  public WarningInfoInner parameter(List<KeyValueArrayInner> parameter) {
    this.parameter = parameter;
    return this;
  }

  public WarningInfoInner addParameterItem(KeyValueArrayInner parameterItem) {
    this.parameter.add(parameterItem);
    return this;
  }

 /**
   * Get area
   * @return area
  **/
  @JsonProperty("area")
  public List<WarningInfoInnerAreaInner> getArea() {
    return area;
  }

  public void setArea(List<WarningInfoInnerAreaInner> area) {
    this.area = area;
  }

  public WarningInfoInner area(List<WarningInfoInnerAreaInner> area) {
    this.area = area;
    return this;
  }

  public WarningInfoInner addAreaItem(WarningInfoInnerAreaInner areaItem) {
    this.area.add(areaItem);
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
    WarningInfoInner warningInfoInner = (WarningInfoInner) o;
    return Objects.equals(category, warningInfoInner.category) &&
        Objects.equals(event, warningInfoInner.event) &&
        Objects.equals(urgency, warningInfoInner.urgency) &&
        Objects.equals(severity, warningInfoInner.severity) &&
        Objects.equals(certainty, warningInfoInner.certainty) &&
        Objects.equals(eventCode, warningInfoInner.eventCode) &&
        Objects.equals(effective, warningInfoInner.effective) &&
        Objects.equals(senderName, warningInfoInner.senderName) &&
        Objects.equals(headline, warningInfoInner.headline) &&
        Objects.equals(description, warningInfoInner.description) &&
        Objects.equals(web, warningInfoInner.web) &&
        Objects.equals(parameter, warningInfoInner.parameter) &&
        Objects.equals(area, warningInfoInner.area);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, event, urgency, severity, certainty, eventCode, effective, senderName, headline, description, web, parameter, area);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningInfoInner {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    certainty: ").append(toIndentedString(certainty)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

