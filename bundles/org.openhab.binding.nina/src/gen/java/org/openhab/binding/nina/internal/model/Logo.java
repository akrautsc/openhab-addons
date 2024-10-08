package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Logo  {
  
  private String senderId;

  private String name;

 /**
   * Dateiname, relativ zu https://warnung.bund.de/api31/appdata/gsb/logos/ (z.B.: https://warnung.bund.de/api31/appdata/gsb/logos/dwd_logo.png). Bei machen Logos nicht definiert.
  **/
  private String image;

 /**
   * Orientierung des Logos, 0 oder 1
  **/
  private String orientation;

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;
 /**
   * Get senderId
   * @return senderId
  **/
  @JsonProperty("senderId")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public Logo senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Logo name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Dateiname, relativ zu https://warnung.bund.de/api31/appdata/gsb/logos/ (z.B.: https://warnung.bund.de/api31/appdata/gsb/logos/dwd_logo.png). Bei machen Logos nicht definiert.
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Logo image(String image) {
    this.image = image;
    return this;
  }

 /**
   * Orientierung des Logos, 0 oder 1
   * @return orientation
  **/
  @JsonProperty("orientation")
  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public Logo orientation(String orientation) {
    this.orientation = orientation;
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

  public Logo lastModificationDate(Long lastModificationDate) {
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
    Logo logo = (Logo) o;
    return Objects.equals(senderId, logo.senderId) &&
        Objects.equals(name, logo.name) &&
        Objects.equals(image, logo.image) &&
        Objects.equals(orientation, logo.orientation) &&
        Objects.equals(lastModificationDate, logo.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderId, name, image, orientation, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logo {\n");
    
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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

