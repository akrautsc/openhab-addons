package org.openhab.binding.nina.internal.model;

import org.openhab.binding.nina.internal.model.CovidInfosArticle;
import org.openhab.binding.nina.internal.model.CovidInfosImage;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CovidInfosTip  {
  
  private CovidInfosImage image;

  private String title;

  private CovidInfosArticle article;
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

  public CovidInfosTip image(CovidInfosImage image) {
    this.image = image;
    return this;
  }

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

  public CovidInfosTip title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get article
   * @return article
  **/
  @JsonProperty("article")
  public CovidInfosArticle getArticle() {
    return article;
  }

  public void setArticle(CovidInfosArticle article) {
    this.article = article;
  }

  public CovidInfosTip article(CovidInfosArticle article) {
    this.article = article;
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
    CovidInfosTip covidInfosTip = (CovidInfosTip) o;
    return Objects.equals(image, covidInfosTip.image) &&
        Objects.equals(title, covidInfosTip.title) &&
        Objects.equals(article, covidInfosTip.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, title, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidInfosTip {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

