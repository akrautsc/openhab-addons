package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.ARSCovidRulesRulesInnerIcon;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRulesRulesInner  {
  
  private String id;

  private String caption;

  private String text;

  private String source;

  private ARSCovidRulesRulesInnerIcon icon;
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

  public ARSCovidRulesRulesInner id(String id) {
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

  public ARSCovidRulesRulesInner caption(String caption) {
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

  public ARSCovidRulesRulesInner text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ARSCovidRulesRulesInner source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public ARSCovidRulesRulesInnerIcon getIcon() {
    return icon;
  }

  public void setIcon(ARSCovidRulesRulesInnerIcon icon) {
    this.icon = icon;
  }

  public ARSCovidRulesRulesInner icon(ARSCovidRulesRulesInnerIcon icon) {
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
    ARSCovidRulesRulesInner arSCovidRulesRulesInner = (ARSCovidRulesRulesInner) o;
    return Objects.equals(id, arSCovidRulesRulesInner.id) &&
        Objects.equals(caption, arSCovidRulesRulesInner.caption) &&
        Objects.equals(text, arSCovidRulesRulesInner.text) &&
        Objects.equals(source, arSCovidRulesRulesInner.source) &&
        Objects.equals(icon, arSCovidRulesRulesInner.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caption, text, source, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRulesRulesInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

