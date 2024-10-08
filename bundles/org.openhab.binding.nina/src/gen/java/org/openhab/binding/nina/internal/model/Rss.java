package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.RssChannel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Rss  {
  
  private String version;

  private RssChannel channel;
 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Rss version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Get channel
   * @return channel
  **/
  @JsonProperty("channel")
  public RssChannel getChannel() {
    return channel;
  }

  public void setChannel(RssChannel channel) {
    this.channel = channel;
  }

  public Rss channel(RssChannel channel) {
    this.channel = channel;
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
    Rss rss = (Rss) o;
    return Objects.equals(version, rss.version) &&
        Objects.equals(channel, rss.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rss {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

