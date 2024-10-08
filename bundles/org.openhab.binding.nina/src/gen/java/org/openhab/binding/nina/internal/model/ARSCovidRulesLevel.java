package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesLevel  {
  
  private String headline;

  private String range;

  private String backgroundColor;

  private String textColor;
 /**
   * Get headline
   * @return headline
  **/
  @JsonProperty("headline")
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public ARSCovidRulesLevel headline(String headline) {
    this.headline = headline;
    return this;
  }

 /**
   * Get range
   * @return range
  **/
  @JsonProperty("range")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public ARSCovidRulesLevel range(String range) {
    this.range = range;
    return this;
  }

 /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public ARSCovidRulesLevel backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

 /**
   * Get textColor
   * @return textColor
  **/
  @JsonProperty("textColor")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public ARSCovidRulesLevel textColor(String textColor) {
    this.textColor = textColor;
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
    ARSCovidRulesLevel arSCovidRulesLevel = (ARSCovidRulesLevel) o;
    return Objects.equals(headline, arSCovidRulesLevel.headline) &&
        Objects.equals(range, arSCovidRulesLevel.range) &&
        Objects.equals(backgroundColor, arSCovidRulesLevel.backgroundColor) &&
        Objects.equals(textColor, arSCovidRulesLevel.textColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, range, backgroundColor, textColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesLevel {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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

