package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.EventCode;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EventCodeCollection  {
  
  private List<EventCode> eventCodes = new ArrayList<>();

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;
 /**
   * Get eventCodes
   * @return eventCodes
  **/
  @JsonProperty("eventCodes")
  public List<EventCode> getEventCodes() {
    return eventCodes;
  }

  public void setEventCodes(List<EventCode> eventCodes) {
    this.eventCodes = eventCodes;
  }

  public EventCodeCollection eventCodes(List<EventCode> eventCodes) {
    this.eventCodes = eventCodes;
    return this;
  }

  public EventCodeCollection addEventCodesItem(EventCode eventCodesItem) {
    this.eventCodes.add(eventCodesItem);
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

  public EventCodeCollection lastModificationDate(Long lastModificationDate) {
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
    EventCodeCollection eventCodeCollection = (EventCodeCollection) o;
    return Objects.equals(eventCodes, eventCodeCollection.eventCodes) &&
        Objects.equals(lastModificationDate, eventCodeCollection.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCodes, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCodeCollection {\n");
    
    sb.append("    eventCodes: ").append(toIndentedString(eventCodes)).append("\n");
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

