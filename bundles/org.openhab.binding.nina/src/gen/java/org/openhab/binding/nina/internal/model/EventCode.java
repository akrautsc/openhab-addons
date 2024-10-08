package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EventCode  {
  
  private String eventCode;

 /**
   * Dateiname, relativ zu https://warnung.bund.de/api31/appdata/gsb/eventCodes/ (z.B.: https://warnung.bund.de/api31/appdata/gsb/eventCodes/BBK-EVC-001.png).
  **/
  private String image;
 /**
   * Get eventCode
   * @return eventCode
  **/
  @JsonProperty("eventCode")
  public String getEventCode() {
    return eventCode;
  }

  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }

  public EventCode eventCode(String eventCode) {
    this.eventCode = eventCode;
    return this;
  }

 /**
   * Dateiname, relativ zu https://warnung.bund.de/api31/appdata/gsb/eventCodes/ (z.B.: https://warnung.bund.de/api31/appdata/gsb/eventCodes/BBK-EVC-001.png).
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public EventCode image(String image) {
    this.image = image;
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
    EventCode eventCode = (EventCode) o;
    return Objects.equals(eventCode, eventCode.eventCode) &&
        Objects.equals(image, eventCode.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCode {\n");
    
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

