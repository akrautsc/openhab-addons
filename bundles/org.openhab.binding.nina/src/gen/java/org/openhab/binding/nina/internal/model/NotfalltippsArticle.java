package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.NotfalltippsImage;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotfalltippsArticle  {
  
  private String title;

  private String bodyText;

  private NotfalltippsImage image;

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;
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

  public NotfalltippsArticle title(String title) {
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

  public NotfalltippsArticle bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public NotfalltippsImage getImage() {
    return image;
  }

  public void setImage(NotfalltippsImage image) {
    this.image = image;
  }

  public NotfalltippsArticle image(NotfalltippsImage image) {
    this.image = image;
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

  public NotfalltippsArticle lastModificationDate(Long lastModificationDate) {
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
    NotfalltippsArticle notfalltippsArticle = (NotfalltippsArticle) o;
    return Objects.equals(title, notfalltippsArticle.title) &&
        Objects.equals(bodyText, notfalltippsArticle.bodyText) &&
        Objects.equals(image, notfalltippsArticle.image) &&
        Objects.equals(lastModificationDate, notfalltippsArticle.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, bodyText, image, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotfalltippsArticle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

