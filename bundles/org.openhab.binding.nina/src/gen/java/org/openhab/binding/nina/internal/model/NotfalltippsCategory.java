package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.NotfalltippsTip;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotfalltippsCategory  {
  
  private String title;

  private List<NotfalltippsTip> tips = new ArrayList<>();

 /**
   * Event Codes, zugehörige Logos können über /appdata/gsb/eventCodes/eventCodes.json abgerufen werden.
  **/
  private List<String> eventCodes;

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

  public NotfalltippsCategory title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get tips
   * @return tips
  **/
  @JsonProperty("tips")
  public List<NotfalltippsTip> getTips() {
    return tips;
  }

  public void setTips(List<NotfalltippsTip> tips) {
    this.tips = tips;
  }

  public NotfalltippsCategory tips(List<NotfalltippsTip> tips) {
    this.tips = tips;
    return this;
  }

  public NotfalltippsCategory addTipsItem(NotfalltippsTip tipsItem) {
    this.tips.add(tipsItem);
    return this;
  }

 /**
   * Event Codes, zugehörige Logos können über /appdata/gsb/eventCodes/eventCodes.json abgerufen werden.
   * @return eventCodes
  **/
  @JsonProperty("eventCodes")
  public List<String> getEventCodes() {
    return eventCodes;
  }

  public void setEventCodes(List<String> eventCodes) {
    this.eventCodes = eventCodes;
  }

  public NotfalltippsCategory eventCodes(List<String> eventCodes) {
    this.eventCodes = eventCodes;
    return this;
  }

  public NotfalltippsCategory addEventCodesItem(String eventCodesItem) {
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

  public NotfalltippsCategory lastModificationDate(Long lastModificationDate) {
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
    NotfalltippsCategory notfalltippsCategory = (NotfalltippsCategory) o;
    return Objects.equals(title, notfalltippsCategory.title) &&
        Objects.equals(tips, notfalltippsCategory.tips) &&
        Objects.equals(eventCodes, notfalltippsCategory.eventCodes) &&
        Objects.equals(lastModificationDate, notfalltippsCategory.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, tips, eventCodes, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotfalltippsCategory {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
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

