package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RssChannelImage  {
  
  private String title;

  private String link;

  private String url;
 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RssChannelImage title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get link
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public RssChannelImage link(String link) {
    this.link = link;
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

  public RssChannelImage url(String url) {
    this.url = url;
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
    RssChannelImage rssChannelImage = (RssChannelImage) o;
    return Objects.equals(title, rssChannelImage.title) &&
        Objects.equals(link, rssChannelImage.link) &&
        Objects.equals(url, rssChannelImage.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, link, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RssChannelImage {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

