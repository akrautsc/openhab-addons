package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.Version;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionCollection  {
  
  private Integer version;

  private String hash;

  private List<Version> entries = new ArrayList<>();
 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public VersionCollection version(Integer version) {
    this.version = version;
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

  public VersionCollection hash(String hash) {
    this.hash = hash;
    return this;
  }

 /**
   * Get entries
   * @return entries
  **/
  @JsonProperty("entries")
  public List<Version> getEntries() {
    return entries;
  }

  public void setEntries(List<Version> entries) {
    this.entries = entries;
  }

  public VersionCollection entries(List<Version> entries) {
    this.entries = entries;
    return this;
  }

  public VersionCollection addEntriesItem(Version entriesItem) {
    this.entries.add(entriesItem);
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
    VersionCollection versionCollection = (VersionCollection) o;
    return Objects.equals(version, versionCollection.version) &&
        Objects.equals(hash, versionCollection.hash) &&
        Objects.equals(entries, versionCollection.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, hash, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionCollection {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

