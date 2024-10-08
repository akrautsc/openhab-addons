package org.openhab.binding.nina.internal.model;

import java.util.Date;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidInfosArticle  {
  
  private String title;

  private String bodyText;

  private String function;

  private Date dateOfIssue;

  private Date lastModificationDate;
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

  public CovidInfosArticle title(String title) {
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

  public CovidInfosArticle bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public CovidInfosArticle function(String function) {
    this.function = function;
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

  public CovidInfosArticle dateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
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

  public CovidInfosArticle lastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
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
    CovidInfosArticle covidInfosArticle = (CovidInfosArticle) o;
    return Objects.equals(title, covidInfosArticle.title) &&
        Objects.equals(bodyText, covidInfosArticle.bodyText) &&
        Objects.equals(function, covidInfosArticle.function) &&
        Objects.equals(dateOfIssue, covidInfosArticle.dateOfIssue) &&
        Objects.equals(lastModificationDate, covidInfosArticle.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, bodyText, function, dateOfIssue, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidInfosArticle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
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

