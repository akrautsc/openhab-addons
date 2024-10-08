package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.CovidMapData;
import org.openhab.binding.nina.internal.model.CovidMapLegend;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Kartendaten für Corona Fallzahlen
 **/

public class CovidMap  {
  
  private List<CovidMapLegend> mapLegend = new ArrayList<>();

  private List<CovidMapData> mapData = new ArrayList<>();
 /**
   * Get mapLegend
   * @return mapLegend
  **/
  @JsonProperty("mapLegend")
  public List<CovidMapLegend> getMapLegend() {
    return mapLegend;
  }

  public void setMapLegend(List<CovidMapLegend> mapLegend) {
    this.mapLegend = mapLegend;
  }

  public CovidMap mapLegend(List<CovidMapLegend> mapLegend) {
    this.mapLegend = mapLegend;
    return this;
  }

  public CovidMap addMapLegendItem(CovidMapLegend mapLegendItem) {
    this.mapLegend.add(mapLegendItem);
    return this;
  }

 /**
   * Get mapData
   * @return mapData
  **/
  @JsonProperty("mapData")
  public List<CovidMapData> getMapData() {
    return mapData;
  }

  public void setMapData(List<CovidMapData> mapData) {
    this.mapData = mapData;
  }

  public CovidMap mapData(List<CovidMapData> mapData) {
    this.mapData = mapData;
    return this;
  }

  public CovidMap addMapDataItem(CovidMapData mapDataItem) {
    this.mapData.add(mapDataItem);
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
    CovidMap covidMap = (CovidMap) o;
    return Objects.equals(mapLegend, covidMap.mapLegend) &&
        Objects.equals(mapData, covidMap.mapData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapLegend, mapData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidMap {\n");
    
    sb.append("    mapLegend: ").append(toIndentedString(mapLegend)).append("\n");
    sb.append("    mapData: ").append(toIndentedString(mapData)).append("\n");
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

