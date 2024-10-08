package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRegulationsSectionsBUNDIcon  {
  
  private String src;

  private String hash;
 /**
   * Get src
   * @return src
  **/
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public ARSCovidRulesRegulationsSectionsBUNDIcon src(String src) {
    this.src = src;
    return this;
  }

 /**
   * Get hash
   * @return hash
  **/
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public ARSCovidRulesRegulationsSectionsBUNDIcon hash(String hash) {
    this.hash = hash;
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
    ARSCovidRulesRegulationsSectionsBUNDIcon arSCovidRulesRegulationsSectionsBUNDIcon = (ARSCovidRulesRegulationsSectionsBUNDIcon) o;
    return Objects.equals(src, arSCovidRulesRegulationsSectionsBUNDIcon.src) &&
        Objects.equals(hash, arSCovidRulesRegulationsSectionsBUNDIcon.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRegulationsSectionsBUNDIcon {\n");
    
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

