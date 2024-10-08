package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.RssChannelImage;
import org.openhab.binding.nina.internal.model.RssChannelItemInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RssChannel  {
  
  private String title;

  private String link;

  private String description;

  private String pubDate;

  private RssChannelImage image;

  private List<RssChannelItemInner> item;
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

  public RssChannel title(String title) {
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

  public RssChannel link(String link) {
    this.link = link;
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

  public RssChannel description(String description) {
    this.description = description;
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

  public RssChannel pubDate(String pubDate) {
    this.pubDate = pubDate;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public RssChannelImage getImage() {
    return image;
  }

  public void setImage(RssChannelImage image) {
    this.image = image;
  }

  public RssChannel image(RssChannelImage image) {
    this.image = image;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public List<RssChannelItemInner> getItem() {
    return item;
  }

  public void setItem(List<RssChannelItemInner> item) {
    this.item = item;
  }

  public RssChannel item(List<RssChannelItemInner> item) {
    this.item = item;
    return this;
  }

  public RssChannel addItemItem(RssChannelItemInner itemItem) {
    this.item.add(itemItem);
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
    RssChannel rssChannel = (RssChannel) o;
    return Objects.equals(title, rssChannel.title) &&
        Objects.equals(link, rssChannel.link) &&
        Objects.equals(description, rssChannel.description) &&
        Objects.equals(pubDate, rssChannel.pubDate) &&
        Objects.equals(image, rssChannel.image) &&
        Objects.equals(item, rssChannel.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, link, description, pubDate, image, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RssChannel {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pubDate: ").append(toIndentedString(pubDate)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

