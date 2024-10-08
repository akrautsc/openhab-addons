package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RssChannelItemInner  {
  
  private String title;

  private String link;

  private String pubDate;

  private String guid;

  private String description;
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

  public RssChannelItemInner title(String title) {
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

  public RssChannelItemInner link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Get pubDate
   * @return pubDate
  **/
  @JsonProperty("pubDate")
  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public RssChannelItemInner pubDate(String pubDate) {
    this.pubDate = pubDate;
    return this;
  }

 /**
   * Get guid
   * @return guid
  **/
  @JsonProperty("guid")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public RssChannelItemInner guid(String guid) {
    this.guid = guid;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RssChannelItemInner description(String description) {
    this.description = description;
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
    RssChannelItemInner rssChannelItemInner = (RssChannelItemInner) o;
    return Objects.equals(title, rssChannelItemInner.title) &&
        Objects.equals(link, rssChannelItemInner.link) &&
        Objects.equals(pubDate, rssChannelItemInner.pubDate) &&
        Objects.equals(guid, rssChannelItemInner.guid) &&
        Objects.equals(description, rssChannelItemInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, link, pubDate, guid, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RssChannelItemInner {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    pubDate: ").append(toIndentedString(pubDate)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

