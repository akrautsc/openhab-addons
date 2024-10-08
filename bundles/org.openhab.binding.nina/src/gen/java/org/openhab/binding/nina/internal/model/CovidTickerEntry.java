package org.openhab.binding.nina.internal.model;

import java.util.Date;
import java.util.UUID;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidTickerEntry  {
  
 /**
   * Tickermeldungs-ID, details können über /appdata/covid/covidticker/DE/tickermeldungen/{id}.json abgerufen werden.
  **/
  private UUID id;

  private Date lastModificationDate;
 /**
   * Tickermeldungs-ID, details können über /appdata/covid/covidticker/DE/tickermeldungen/{id}.json abgerufen werden.
   * @return id
  **/
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CovidTickerEntry id(UUID id) {
    this.id = id;
    return this;
  }

 /**
   * Get lastModificationDate
   * @return lastModificationDate
  **/
  @JsonProperty("lastModificationDate")
  public Date getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public CovidTickerEntry lastModificationDate(Date lastModificationDate) {
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
    CovidTickerEntry covidTickerEntry = (CovidTickerEntry) o;
    return Objects.equals(id, covidTickerEntry.id) &&
        Objects.equals(lastModificationDate, covidTickerEntry.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidTickerEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

