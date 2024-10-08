package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidMapStyle  {
  
  private Float strokeOpacity;

  private Integer strokeWeight;

  private String strokeColor;

  private Float fillOpacity;

  private String fillColor;
 /**
   * Get strokeOpacity
   * @return strokeOpacity
  **/
  @JsonProperty("strokeOpacity")
  public Float getStrokeOpacity() {
    return strokeOpacity;
  }

  public void setStrokeOpacity(Float strokeOpacity) {
    this.strokeOpacity = strokeOpacity;
  }

  public CovidMapStyle strokeOpacity(Float strokeOpacity) {
    this.strokeOpacity = strokeOpacity;
    return this;
  }

 /**
   * Get strokeWeight
   * @return strokeWeight
  **/
  @JsonProperty("strokeWeight")
  public Integer getStrokeWeight() {
    return strokeWeight;
  }

  public void setStrokeWeight(Integer strokeWeight) {
    this.strokeWeight = strokeWeight;
  }

  public CovidMapStyle strokeWeight(Integer strokeWeight) {
    this.strokeWeight = strokeWeight;
    return this;
  }

 /**
   * Get strokeColor
   * @return strokeColor
  **/
  @JsonProperty("strokeColor")
  public String getStrokeColor() {
    return strokeColor;
  }

  public void setStrokeColor(String strokeColor) {
    this.strokeColor = strokeColor;
  }

  public CovidMapStyle strokeColor(String strokeColor) {
    this.strokeColor = strokeColor;
    return this;
  }

 /**
   * Get fillOpacity
   * @return fillOpacity
  **/
  @JsonProperty("fillOpacity")
  public Float getFillOpacity() {
    return fillOpacity;
  }

  public void setFillOpacity(Float fillOpacity) {
    this.fillOpacity = fillOpacity;
  }

  public CovidMapStyle fillOpacity(Float fillOpacity) {
    this.fillOpacity = fillOpacity;
    return this;
  }

 /**
   * Get fillColor
   * @return fillColor
  **/
  @JsonProperty("fillColor")
  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public CovidMapStyle fillColor(String fillColor) {
    this.fillColor = fillColor;
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
    CovidMapStyle covidMapStyle = (CovidMapStyle) o;
    return Objects.equals(strokeOpacity, covidMapStyle.strokeOpacity) &&
        Objects.equals(strokeWeight, covidMapStyle.strokeWeight) &&
        Objects.equals(strokeColor, covidMapStyle.strokeColor) &&
        Objects.equals(fillOpacity, covidMapStyle.fillOpacity) &&
        Objects.equals(fillColor, covidMapStyle.fillColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strokeOpacity, strokeWeight, strokeColor, fillOpacity, fillColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidMapStyle {\n");
    
    sb.append("    strokeOpacity: ").append(toIndentedString(strokeOpacity)).append("\n");
    sb.append("    strokeWeight: ").append(toIndentedString(strokeWeight)).append("\n");
    sb.append("    strokeColor: ").append(toIndentedString(strokeColor)).append("\n");
    sb.append("    fillOpacity: ").append(toIndentedString(fillOpacity)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
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

