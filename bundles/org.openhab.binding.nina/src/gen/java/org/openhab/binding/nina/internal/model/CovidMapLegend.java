package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.CovidMapStyle;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidMapLegend  {
  
  private String label;

  private CovidMapStyle properties;
 /**
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CovidMapLegend label(String label) {
    this.label = label;
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

  public CovidMapLegend properties(CovidMapStyle properties) {
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
    CovidMapLegend covidMapLegend = (CovidMapLegend) o;
    return Objects.equals(label, covidMapLegend.label) &&
        Objects.equals(properties, covidMapLegend.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidMapLegend {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

