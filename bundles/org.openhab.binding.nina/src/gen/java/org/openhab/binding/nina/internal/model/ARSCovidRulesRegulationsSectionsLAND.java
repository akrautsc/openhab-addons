package org.openhab.binding.nina.internal.model;

import java.util.Date;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsLANDIcon;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulationsSectionsLAND  {
  
  private String caption;

  private String url;

  private Date validFrom;

  private Date validUntil;

  private ARSCovidRulesRegulationsSectionsLANDIcon icon;
 /**
   * Get caption
   * @return caption
  **/
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public ARSCovidRulesRegulationsSectionsLAND caption(String caption) {
    this.caption = caption;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ARSCovidRulesRegulationsSectionsLAND url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get validFrom
   * @return validFrom
  **/
  @JsonProperty("validFrom")
  public Date getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(Date validFrom) {
    this.validFrom = validFrom;
  }

  public ARSCovidRulesRegulationsSectionsLAND validFrom(Date validFrom) {
    this.validFrom = validFrom;
    return this;
  }

 /**
   * Get validUntil
   * @return validUntil
  **/
  @JsonProperty("validUntil")
  public Date getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(Date validUntil) {
    this.validUntil = validUntil;
  }

  public ARSCovidRulesRegulationsSectionsLAND validUntil(Date validUntil) {
    this.validUntil = validUntil;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public ARSCovidRulesRegulationsSectionsLANDIcon getIcon() {
    return icon;
  }

  public void setIcon(ARSCovidRulesRegulationsSectionsLANDIcon icon) {
    this.icon = icon;
  }

  public ARSCovidRulesRegulationsSectionsLAND icon(ARSCovidRulesRegulationsSectionsLANDIcon icon) {
    this.icon = icon;
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
    ARSCovidRulesRegulationsSectionsLAND arSCovidRulesRegulationsSectionsLAND = (ARSCovidRulesRegulationsSectionsLAND) o;
    return Objects.equals(caption, arSCovidRulesRegulationsSectionsLAND.caption) &&
        Objects.equals(url, arSCovidRulesRegulationsSectionsLAND.url) &&
        Objects.equals(validFrom, arSCovidRulesRegulationsSectionsLAND.validFrom) &&
        Objects.equals(validUntil, arSCovidRulesRegulationsSectionsLAND.validUntil) &&
        Objects.equals(icon, arSCovidRulesRegulationsSectionsLAND.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, url, validFrom, validUntil, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulationsSectionsLAND {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

