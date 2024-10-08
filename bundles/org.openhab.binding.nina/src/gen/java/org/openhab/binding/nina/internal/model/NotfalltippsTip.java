package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.NotfalltippsArticle;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotfalltippsTip  {
  
  private String title;

  private List<NotfalltippsArticle> articles;
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

  public NotfalltippsTip title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get articles
   * @return articles
  **/
  @JsonProperty("articles")
  public List<NotfalltippsArticle> getArticles() {
    return articles;
  }

  public void setArticles(List<NotfalltippsArticle> articles) {
    this.articles = articles;
  }

  public NotfalltippsTip articles(List<NotfalltippsArticle> articles) {
    this.articles = articles;
    return this;
  }

  public NotfalltippsTip addArticlesItem(NotfalltippsArticle articlesItem) {
    this.articles.add(articlesItem);
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
    NotfalltippsTip notfalltippsTip = (NotfalltippsTip) o;
    return Objects.equals(title, notfalltippsTip.title) &&
        Objects.equals(articles, notfalltippsTip.articles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, articles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotfalltippsTip {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
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

