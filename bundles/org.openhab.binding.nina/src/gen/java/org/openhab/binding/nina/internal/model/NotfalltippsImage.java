package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotfalltippsImage  {
  
  private String src;

  private String title;

  private String alt;

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;

  private String hash;
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

  public NotfalltippsImage src(String src) {
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

  public NotfalltippsImage title(String title) {
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

  public NotfalltippsImage alt(String alt) {
    this.alt = alt;
    return this;
  }

 /**
   * Unix-Zeitstempel der letzten Änderung
   * @return lastModificationDate
  **/
  @JsonProperty("lastModificationDate")
  public Long getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public NotfalltippsImage lastModificationDate(Long lastModificationDate) {
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

  public NotfalltippsImage hash(String hash) {
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
    NotfalltippsImage notfalltippsImage = (NotfalltippsImage) o;
    return Objects.equals(src, notfalltippsImage.src) &&
        Objects.equals(title, notfalltippsImage.title) &&
        Objects.equals(alt, notfalltippsImage.alt) &&
        Objects.equals(lastModificationDate, notfalltippsImage.lastModificationDate) &&
        Objects.equals(hash, notfalltippsImage.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, title, alt, lastModificationDate, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotfalltippsImage {\n");
    
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
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

