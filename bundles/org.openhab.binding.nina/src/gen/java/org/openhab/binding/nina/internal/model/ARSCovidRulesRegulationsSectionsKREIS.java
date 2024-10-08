package org.openhab.binding.nina.internal.model;

import java.util.Date;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsKREISIcon;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulationsSectionsKREIS  {
  
  private String caption;

  private String url;

  private Date validFrom;

  private ARSCovidRulesRegulationsSectionsKREISIcon icon;
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

  public ARSCovidRulesRegulationsSectionsKREIS caption(String caption) {
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

  public ARSCovidRulesRegulationsSectionsKREIS url(String url) {
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

  public ARSCovidRulesRegulationsSectionsKREIS validFrom(Date validFrom) {
    this.validFrom = validFrom;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public ARSCovidRulesRegulationsSectionsKREISIcon getIcon() {
    return icon;
  }

  public void setIcon(ARSCovidRulesRegulationsSectionsKREISIcon icon) {
    this.icon = icon;
  }

  public ARSCovidRulesRegulationsSectionsKREIS icon(ARSCovidRulesRegulationsSectionsKREISIcon icon) {
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
    ARSCovidRulesRegulationsSectionsKREIS arSCovidRulesRegulationsSectionsKREIS = (ARSCovidRulesRegulationsSectionsKREIS) o;
    return Objects.equals(caption, arSCovidRulesRegulationsSectionsKREIS.caption) &&
        Objects.equals(url, arSCovidRulesRegulationsSectionsKREIS.url) &&
        Objects.equals(validFrom, arSCovidRulesRegulationsSectionsKREIS.validFrom) &&
        Objects.equals(icon, arSCovidRulesRegulationsSectionsKREIS.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, url, validFrom, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulationsSectionsKREIS {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
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

