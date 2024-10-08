package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSections;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulations  {
  
  private String validFromUntil;

  private ARSCovidRulesRegulationsSections sections;
 /**
   * Get validFromUntil
   * @return validFromUntil
  **/
  @JsonProperty("validFromUntil")
  public String getValidFromUntil() {
    return validFromUntil;
  }

  public void setValidFromUntil(String validFromUntil) {
    this.validFromUntil = validFromUntil;
  }

  public ARSCovidRulesRegulations validFromUntil(String validFromUntil) {
    this.validFromUntil = validFromUntil;
    return this;
  }

 /**
   * Get sections
   * @return sections
  **/
  @JsonProperty("sections")
  public ARSCovidRulesRegulationsSections getSections() {
    return sections;
  }

  public void setSections(ARSCovidRulesRegulationsSections sections) {
    this.sections = sections;
  }

  public ARSCovidRulesRegulations sections(ARSCovidRulesRegulationsSections sections) {
    this.sections = sections;
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
    ARSCovidRulesRegulations arSCovidRulesRegulations = (ARSCovidRulesRegulations) o;
    return Objects.equals(validFromUntil, arSCovidRulesRegulations.validFromUntil) &&
        Objects.equals(sections, arSCovidRulesRegulations.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFromUntil, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulations {\n");
    
    sb.append("    validFromUntil: ").append(toIndentedString(validFromUntil)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

