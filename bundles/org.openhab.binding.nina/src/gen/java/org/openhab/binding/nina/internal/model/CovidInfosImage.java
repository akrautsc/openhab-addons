package org.openhab.binding.nina.internal.model;

import java.util.Date;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidInfosImage  {
  
  private String id;

  private String src;

  private String title;

  private String alt;

  private String sourceText;

  private Date lastModificationDate;

  private String hash;
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

  public CovidInfosImage id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get src
   * @return src
  **/
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public CovidInfosImage src(String src) {
    this.src = src;
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

  public CovidInfosImage title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get alt
   * @return alt
  **/
  @JsonProperty("alt")
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public CovidInfosImage alt(String alt) {
    this.alt = alt;
    return this;
  }

 /**
   * Get sourceText
   * @return sourceText
  **/
  @JsonProperty("sourceText")
  public String getSourceText() {
    return sourceText;
  }

  public void setSourceText(String sourceText) {
    this.sourceText = sourceText;
  }

  public CovidInfosImage sourceText(String sourceText) {
    this.sourceText = sourceText;
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

  public CovidInfosImage lastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
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

  public CovidInfosImage hash(String hash) {
    this.hash = hash;
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
    CovidInfosImage covidInfosImage = (CovidInfosImage) o;
    return Objects.equals(id, covidInfosImage.id) &&
        Objects.equals(src, covidInfosImage.src) &&
        Objects.equals(title, covidInfosImage.title) &&
        Objects.equals(alt, covidInfosImage.alt) &&
        Objects.equals(sourceText, covidInfosImage.sourceText) &&
        Objects.equals(lastModificationDate, covidInfosImage.lastModificationDate) &&
        Objects.equals(hash, covidInfosImage.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, src, title, alt, sourceText, lastModificationDate, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidInfosImage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    sourceText: ").append(toIndentedString(sourceText)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

