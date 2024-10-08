package org.openhab.binding.nina.internal.model;

import java.util.Date;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidTickerMessage  {
  
  private String id;

  private Date dateOfIssue;

  private String title;

  private String bodyText;

  private String teaserText;

  private Boolean push;

  private Date lastModificationDate;

  private Integer version;
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

  public CovidTickerMessage id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get dateOfIssue
   * @return dateOfIssue
  **/
  @JsonProperty("dateOfIssue")
  public Date getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public CovidTickerMessage dateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CovidTickerMessage title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get bodyText
   * @return bodyText
  **/
  @JsonProperty("bodyText")
  public String getBodyText() {
    return bodyText;
  }

  public void setBodyText(String bodyText) {
    this.bodyText = bodyText;
  }

  public CovidTickerMessage bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

 /**
   * Get teaserText
   * @return teaserText
  **/
  @JsonProperty("teaserText")
  public String getTeaserText() {
    return teaserText;
  }

  public void setTeaserText(String teaserText) {
    this.teaserText = teaserText;
  }

  public CovidTickerMessage teaserText(String teaserText) {
    this.teaserText = teaserText;
    return this;
  }

 /**
   * Get push
   * @return push
  **/
  @JsonProperty("push")
  public Boolean getPush() {
    return push;
  }

  public void setPush(Boolean push) {
    this.push = push;
  }

  public CovidTickerMessage push(Boolean push) {
    this.push = push;
    return this;
  }

 /**
   * Get lastModificationDate
   * @return lastModificationDate
  **/
  @JsonProperty("lastModificationDate")
  public Date getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public CovidTickerMessage lastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
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

  public CovidTickerMessage version(Integer version) {
    this.version = version;
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
    CovidTickerMessage covidTickerMessage = (CovidTickerMessage) o;
    return Objects.equals(id, covidTickerMessage.id) &&
        Objects.equals(dateOfIssue, covidTickerMessage.dateOfIssue) &&
        Objects.equals(title, covidTickerMessage.title) &&
        Objects.equals(bodyText, covidTickerMessage.bodyText) &&
        Objects.equals(teaserText, covidTickerMessage.teaserText) &&
        Objects.equals(push, covidTickerMessage.push) &&
        Objects.equals(lastModificationDate, covidTickerMessage.lastModificationDate) &&
        Objects.equals(version, covidTickerMessage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateOfIssue, title, bodyText, teaserText, push, lastModificationDate, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidTickerMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    teaserText: ").append(toIndentedString(teaserText)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

