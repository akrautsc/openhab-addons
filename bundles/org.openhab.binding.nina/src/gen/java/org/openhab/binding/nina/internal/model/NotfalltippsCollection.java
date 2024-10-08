package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.NotfalltippsCategory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotfalltippsCollection  {
  
  private List<NotfalltippsCategory> category = new ArrayList<>();

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;
 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public List<NotfalltippsCategory> getCategory() {
    return category;
  }

  public void setCategory(List<NotfalltippsCategory> category) {
    this.category = category;
  }

  public NotfalltippsCollection category(List<NotfalltippsCategory> category) {
    this.category = category;
    return this;
  }

  public NotfalltippsCollection addCategoryItem(NotfalltippsCategory categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

 /**
   * Unix-Zeitstempel der letzten Änderung
   * @return lastModificationDate
  **/
  @JsonProperty("lastModificationDate")
  public Long getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public NotfalltippsCollection lastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
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
    NotfalltippsCollection notfalltippsCollection = (NotfalltippsCollection) o;
    return Objects.equals(category, notfalltippsCollection.category) &&
        Objects.equals(lastModificationDate, notfalltippsCollection.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotfalltippsCollection {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
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

