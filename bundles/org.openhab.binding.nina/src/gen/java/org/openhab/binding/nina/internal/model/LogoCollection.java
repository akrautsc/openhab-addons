package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.Logo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LogoCollection  {
  
 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;

  private List<Logo> logos = new ArrayList<>();
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

  public LogoCollection lastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

 /**
   * Get logos
   * @return logos
  **/
  @JsonProperty("logos")
  public List<Logo> getLogos() {
    return logos;
  }

  public void setLogos(List<Logo> logos) {
    this.logos = logos;
  }

  public LogoCollection logos(List<Logo> logos) {
    this.logos = logos;
    return this;
  }

  public LogoCollection addLogosItem(Logo logosItem) {
    this.logos.add(logosItem);
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
    LogoCollection logoCollection = (LogoCollection) o;
    return Objects.equals(lastModificationDate, logoCollection.lastModificationDate) &&
        Objects.equals(logos, logoCollection.logos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModificationDate, logos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoCollection {\n");
    
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
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

