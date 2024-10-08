package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.NotfalltippsCollection;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Notfalltipps  {
  
  private NotfalltippsCollection notfalltipps;
 /**
   * Get notfalltipps
   * @return notfalltipps
  **/
  @JsonProperty("notfalltipps")
  public NotfalltippsCollection getNotfalltipps() {
    return notfalltipps;
  }

  public void setNotfalltipps(NotfalltippsCollection notfalltipps) {
    this.notfalltipps = notfalltipps;
  }

  public Notfalltipps notfalltipps(NotfalltippsCollection notfalltipps) {
    this.notfalltipps = notfalltipps;
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
    Notfalltipps notfalltipps = (Notfalltipps) o;
    return Objects.equals(notfalltipps, notfalltipps.notfalltipps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notfalltipps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notfalltipps {\n");
    
    sb.append("    notfalltipps: ").append(toIndentedString(notfalltipps)).append("\n");
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

