package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsBUND;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsKREIS;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsLAND;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulationsSections  {
  
  private ARSCovidRulesRegulationsSectionsBUND BUND;

  private ARSCovidRulesRegulationsSectionsLAND LAND;

  private ARSCovidRulesRegulationsSectionsKREIS KREIS;
 /**
   * Get BUND
   * @return BUND
  **/
  @JsonProperty("BUND")
  public ARSCovidRulesRegulationsSectionsBUND getBUND() {
    return BUND;
  }

  public void setBUND(ARSCovidRulesRegulationsSectionsBUND BUND) {
    this.BUND = BUND;
  }

  public ARSCovidRulesRegulationsSections BUND(ARSCovidRulesRegulationsSectionsBUND BUND) {
    this.BUND = BUND;
    return this;
  }

 /**
   * Get LAND
   * @return LAND
  **/
  @JsonProperty("LAND")
  public ARSCovidRulesRegulationsSectionsLAND getLAND() {
    return LAND;
  }

  public void setLAND(ARSCovidRulesRegulationsSectionsLAND LAND) {
    this.LAND = LAND;
  }

  public ARSCovidRulesRegulationsSections LAND(ARSCovidRulesRegulationsSectionsLAND LAND) {
    this.LAND = LAND;
    return this;
  }

 /**
   * Get KREIS
   * @return KREIS
  **/
  @JsonProperty("KREIS")
  public ARSCovidRulesRegulationsSectionsKREIS getKREIS() {
    return KREIS;
  }

  public void setKREIS(ARSCovidRulesRegulationsSectionsKREIS KREIS) {
    this.KREIS = KREIS;
  }

  public ARSCovidRulesRegulationsSections KREIS(ARSCovidRulesRegulationsSectionsKREIS KREIS) {
    this.KREIS = KREIS;
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
    ARSCovidRulesRegulationsSections arSCovidRulesRegulationsSections = (ARSCovidRulesRegulationsSections) o;
    return Objects.equals(BUND, arSCovidRulesRegulationsSections.BUND) &&
        Objects.equals(LAND, arSCovidRulesRegulationsSections.LAND) &&
        Objects.equals(KREIS, arSCovidRulesRegulationsSections.KREIS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BUND, LAND, KREIS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulationsSections {\n");
    
    sb.append("    BUND: ").append(toIndentedString(BUND)).append("\n");
    sb.append("    LAND: ").append(toIndentedString(LAND)).append("\n");
    sb.append("    KREIS: ").append(toIndentedString(KREIS)).append("\n");
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

