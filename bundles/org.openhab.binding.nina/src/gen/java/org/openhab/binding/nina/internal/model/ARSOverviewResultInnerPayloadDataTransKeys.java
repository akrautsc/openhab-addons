package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSOverviewResultInnerPayloadDataTransKeys  {
  
 /**
   * Event Code, zugehörige Logos können über /appdata/gsb/eventCodes/eventCodes.json abgerufen werden.
  **/
  private String event;
 /**
   * Event Code, zugehörige Logos können über /appdata/gsb/eventCodes/eventCodes.json abgerufen werden.
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public ARSOverviewResultInnerPayloadDataTransKeys event(String event) {
    this.event = event;
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
    ARSOverviewResultInnerPayloadDataTransKeys arSOverviewResultInnerPayloadDataTransKeys = (ARSOverviewResultInnerPayloadDataTransKeys) o;
    return Objects.equals(event, arSOverviewResultInnerPayloadDataTransKeys.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSOverviewResultInnerPayloadDataTransKeys {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

