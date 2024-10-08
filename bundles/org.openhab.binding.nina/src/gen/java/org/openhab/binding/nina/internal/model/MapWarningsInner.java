package org.openhab.binding.nina.internal.model;

import java.util.Date;
import org.openhab.binding.nina.internal.model.MapWarningsInnerI18nTitle;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MapWarningsInner  {
  
  private String id;

  private Integer version;

  private Date startDate;

  private String severity;

  private String type;

  private MapWarningsInnerI18nTitle i18nTitle;
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

  public MapWarningsInner id(String id) {
    this.id = id;
    return this;
  }

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

  public MapWarningsInner version(Integer version) {
    this.version = version;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public MapWarningsInner startDate(Date startDate) {
    this.startDate = startDate;
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

  public MapWarningsInner severity(String severity) {
    this.severity = severity;
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

  public MapWarningsInner type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get i18nTitle
   * @return i18nTitle
  **/
  @JsonProperty("i18nTitle")
  public MapWarningsInnerI18nTitle getI18nTitle() {
    return i18nTitle;
  }

  public void setI18nTitle(MapWarningsInnerI18nTitle i18nTitle) {
    this.i18nTitle = i18nTitle;
  }

  public MapWarningsInner i18nTitle(MapWarningsInnerI18nTitle i18nTitle) {
    this.i18nTitle = i18nTitle;
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
    MapWarningsInner mapWarningsInner = (MapWarningsInner) o;
    return Objects.equals(id, mapWarningsInner.id) &&
        Objects.equals(version, mapWarningsInner.version) &&
        Objects.equals(startDate, mapWarningsInner.startDate) &&
        Objects.equals(severity, mapWarningsInner.severity) &&
        Objects.equals(type, mapWarningsInner.type) &&
        Objects.equals(i18nTitle, mapWarningsInner.i18nTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, startDate, severity, type, i18nTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapWarningsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    i18nTitle: ").append(toIndentedString(i18nTitle)).append("\n");
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

