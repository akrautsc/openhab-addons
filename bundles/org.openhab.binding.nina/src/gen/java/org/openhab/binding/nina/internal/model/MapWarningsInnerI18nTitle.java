package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MapWarningsInnerI18nTitle  {
  
  private String de;
 /**
   * Get de
   * @return de
  **/
  @JsonProperty("de")
  public String getDe() {
    return de;
  }

  public void setDe(String de) {
    this.de = de;
  }

  public MapWarningsInnerI18nTitle de(String de) {
    this.de = de;
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
    MapWarningsInnerI18nTitle mapWarningsInnerI18nTitle = (MapWarningsInnerI18nTitle) o;
    return Objects.equals(de, mapWarningsInnerI18nTitle.de);
  }

  @Override
  public int hashCode() {
    return Objects.hash(de);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapWarningsInnerI18nTitle {\n");
    
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
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

