package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.KeyValueArrayInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WarningInfoInnerAreaInner  {
  
  private String areaDesc;

  private List<KeyValueArrayInner> geocode;
 /**
   * Get areaDesc
   * @return areaDesc
  **/
  @JsonProperty("areaDesc")
  public String getAreaDesc() {
    return areaDesc;
  }

  public void setAreaDesc(String areaDesc) {
    this.areaDesc = areaDesc;
  }

  public WarningInfoInnerAreaInner areaDesc(String areaDesc) {
    this.areaDesc = areaDesc;
    return this;
  }

 /**
   * Get geocode
   * @return geocode
  **/
  @JsonProperty("geocode")
  public List<KeyValueArrayInner> getGeocode() {
    return geocode;
  }

  public void setGeocode(List<KeyValueArrayInner> geocode) {
    this.geocode = geocode;
  }

  public WarningInfoInnerAreaInner geocode(List<KeyValueArrayInner> geocode) {
    this.geocode = geocode;
    return this;
  }

  public WarningInfoInnerAreaInner addGeocodeItem(KeyValueArrayInner geocodeItem) {
    this.geocode.add(geocodeItem);
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
    WarningInfoInnerAreaInner warningInfoInnerAreaInner = (WarningInfoInnerAreaInner) o;
    return Objects.equals(areaDesc, warningInfoInnerAreaInner.areaDesc) &&
        Objects.equals(geocode, warningInfoInnerAreaInner.geocode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaDesc, geocode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningInfoInnerAreaInner {\n");
    
    sb.append("    areaDesc: ").append(toIndentedString(areaDesc)).append("\n");
    sb.append("    geocode: ").append(toIndentedString(geocode)).append("\n");
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

