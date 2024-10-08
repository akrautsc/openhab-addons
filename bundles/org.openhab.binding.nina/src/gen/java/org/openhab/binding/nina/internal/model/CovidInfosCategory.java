package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openhab.binding.nina.internal.model.CovidInfosImage;
import org.openhab.binding.nina.internal.model.CovidInfosTip;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidInfosCategory  {
  
  private String title;

  private List<CovidInfosTip> tips = new ArrayList<>();

  private CovidInfosImage image;

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Date lastModificationDate;
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

  public CovidInfosCategory title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get tips
   * @return tips
  **/
  @JsonProperty("tips")
  public List<CovidInfosTip> getTips() {
    return tips;
  }

  public void setTips(List<CovidInfosTip> tips) {
    this.tips = tips;
  }

  public CovidInfosCategory tips(List<CovidInfosTip> tips) {
    this.tips = tips;
    return this;
  }

  public CovidInfosCategory addTipsItem(CovidInfosTip tipsItem) {
    this.tips.add(tipsItem);
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public CovidInfosImage getImage() {
    return image;
  }

  public void setImage(CovidInfosImage image) {
    this.image = image;
  }

  public CovidInfosCategory image(CovidInfosImage image) {
    this.image = image;
    return this;
  }

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

  public CovidInfosCategory lastModificationDate(Date lastModificationDate) {
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
    CovidInfosCategory covidInfosCategory = (CovidInfosCategory) o;
    return Objects.equals(title, covidInfosCategory.title) &&
        Objects.equals(tips, covidInfosCategory.tips) &&
        Objects.equals(image, covidInfosCategory.image) &&
        Objects.equals(lastModificationDate, covidInfosCategory.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, tips, image, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidInfosCategory {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

