package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openhab.binding.nina.internal.model.CovidInfosCategory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Allgemeine Informationen zu Corona
 **/

public class CovidInfos  {
  
 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Date lastModificationDate;

  private List<CovidInfosCategory> categories = new ArrayList<>();
 /**
   * Unix-Zeitstempel der letzten Änderung
   * @return lastModificationDate
  **/
  @JsonProperty("lastModificationDate")
  public Date getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public CovidInfos lastModificationDate(Date lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<CovidInfosCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<CovidInfosCategory> categories) {
    this.categories = categories;
  }

  public CovidInfos categories(List<CovidInfosCategory> categories) {
    this.categories = categories;
    return this;
  }

  public CovidInfos addCategoriesItem(CovidInfosCategory categoriesItem) {
    this.categories.add(categoriesItem);
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
    CovidInfos covidInfos = (CovidInfos) o;
    return Objects.equals(lastModificationDate, covidInfos.lastModificationDate) &&
        Objects.equals(categories, covidInfos.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModificationDate, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidInfos {\n");
    
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

