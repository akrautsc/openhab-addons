package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulationsSectionsBUNDIcon;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulationsSectionsBUND  {
  
  private String caption;

  private String url;

  private ARSCovidRulesRegulationsSectionsBUNDIcon icon;
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

  public ARSCovidRulesRegulationsSectionsBUND caption(String caption) {
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

  public ARSCovidRulesRegulationsSectionsBUND url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public ARSCovidRulesRegulationsSectionsBUNDIcon getIcon() {
    return icon;
  }

  public void setIcon(ARSCovidRulesRegulationsSectionsBUNDIcon icon) {
    this.icon = icon;
  }

  public ARSCovidRulesRegulationsSectionsBUND icon(ARSCovidRulesRegulationsSectionsBUNDIcon icon) {
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
    ARSCovidRulesRegulationsSectionsBUND arSCovidRulesRegulationsSectionsBUND = (ARSCovidRulesRegulationsSectionsBUND) o;
    return Objects.equals(caption, arSCovidRulesRegulationsSectionsBUND.caption) &&
        Objects.equals(url, arSCovidRulesRegulationsSectionsBUND.url) &&
        Objects.equals(icon, arSCovidRulesRegulationsSectionsBUND.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, url, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulationsSectionsBUND {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

