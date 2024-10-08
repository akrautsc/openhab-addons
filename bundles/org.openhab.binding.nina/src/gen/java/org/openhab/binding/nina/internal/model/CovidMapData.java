package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.CovidMapStyle;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidMapData  {
  
  private String rs;

 /**
   * Fälle
  **/
  private Integer cases;

 /**
   * Fälle/100.000 EW
  **/
  private Float casesPer100k;

 /**
   * Fälle der letzten 7 Tage/100.000 EW
  **/
  private Float cases7per100k;

 /**
   * Todesfälle
  **/
  private Integer deaths;

 /**
   * Einwohnerzahl
  **/
  private Integer ewz;

  private String lastUpdate;

  private CovidMapStyle properties;
 /**
   * Get rs
   * @return rs
  **/
  @JsonProperty("rs")
  public String getRs() {
    return rs;
  }

  public void setRs(String rs) {
    this.rs = rs;
  }

  public CovidMapData rs(String rs) {
    this.rs = rs;
    return this;
  }

 /**
   * Fälle
   * @return cases
  **/
  @JsonProperty("cases")
  public Integer getCases() {
    return cases;
  }

  public void setCases(Integer cases) {
    this.cases = cases;
  }

  public CovidMapData cases(Integer cases) {
    this.cases = cases;
    return this;
  }

 /**
   * Fälle/100.000 EW
   * @return casesPer100k
  **/
  @JsonProperty("cases_per_100k")
  public Float getCasesPer100k() {
    return casesPer100k;
  }

  public void setCasesPer100k(Float casesPer100k) {
    this.casesPer100k = casesPer100k;
  }

  public CovidMapData casesPer100k(Float casesPer100k) {
    this.casesPer100k = casesPer100k;
    return this;
  }

 /**
   * Fälle der letzten 7 Tage/100.000 EW
   * @return cases7per100k
  **/
  @JsonProperty("cases7per100k")
  public Float getCases7per100k() {
    return cases7per100k;
  }

  public void setCases7per100k(Float cases7per100k) {
    this.cases7per100k = cases7per100k;
  }

  public CovidMapData cases7per100k(Float cases7per100k) {
    this.cases7per100k = cases7per100k;
    return this;
  }

 /**
   * Todesfälle
   * @return deaths
  **/
  @JsonProperty("deaths")
  public Integer getDeaths() {
    return deaths;
  }

  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  public CovidMapData deaths(Integer deaths) {
    this.deaths = deaths;
    return this;
  }

 /**
   * Einwohnerzahl
   * @return ewz
  **/
  @JsonProperty("ewz")
  public Integer getEwz() {
    return ewz;
  }

  public void setEwz(Integer ewz) {
    this.ewz = ewz;
  }

  public CovidMapData ewz(Integer ewz) {
    this.ewz = ewz;
    return this;
  }

 /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @JsonProperty("lastUpdate")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public CovidMapData lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public CovidMapStyle getProperties() {
    return properties;
  }

  public void setProperties(CovidMapStyle properties) {
    this.properties = properties;
  }

  public CovidMapData properties(CovidMapStyle properties) {
    this.properties = properties;
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
    CovidMapData covidMapData = (CovidMapData) o;
    return Objects.equals(rs, covidMapData.rs) &&
        Objects.equals(cases, covidMapData.cases) &&
        Objects.equals(casesPer100k, covidMapData.casesPer100k) &&
        Objects.equals(cases7per100k, covidMapData.cases7per100k) &&
        Objects.equals(deaths, covidMapData.deaths) &&
        Objects.equals(ewz, covidMapData.ewz) &&
        Objects.equals(lastUpdate, covidMapData.lastUpdate) &&
        Objects.equals(properties, covidMapData.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rs, cases, casesPer100k, cases7per100k, deaths, ewz, lastUpdate, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidMapData {\n");
    
    sb.append("    rs: ").append(toIndentedString(rs)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    casesPer100k: ").append(toIndentedString(casesPer100k)).append("\n");
    sb.append("    cases7per100k: ").append(toIndentedString(cases7per100k)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    ewz: ").append(toIndentedString(ewz)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

