package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesCommonInner  {
  
  private String id;

  private String caption;

  private String text;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ARSCovidRulesCommonInner id(String id) {
    this.id = id;
    return this;
  }

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

  public ARSCovidRulesCommonInner caption(String caption) {
    this.caption = caption;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ARSCovidRulesCommonInner text(String text) {
    this.text = text;
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
    ARSCovidRulesCommonInner arSCovidRulesCommonInner = (ARSCovidRulesCommonInner) o;
    return Objects.equals(id, arSCovidRulesCommonInner.id) &&
        Objects.equals(caption, arSCovidRulesCommonInner.caption) &&
        Objects.equals(text, arSCovidRulesCommonInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caption, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesCommonInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

