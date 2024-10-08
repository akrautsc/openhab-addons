package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.FAQ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FAQCollection  {
  
  private List<FAQ> FAQ = new ArrayList<>();

 /**
   * Unix-Zeitstempel der letzten Änderung
  **/
  private Long lastModificationDate;
 /**
   * Get FAQ
   * @return FAQ
  **/
  @JsonProperty("FAQ")
  public List<FAQ> getFAQ() {
    return FAQ;
  }

  public void setFAQ(List<FAQ> FAQ) {
    this.FAQ = FAQ;
  }

  public FAQCollection FAQ(List<FAQ> FAQ) {
    this.FAQ = FAQ;
    return this;
  }

  public FAQCollection addFAQItem(FAQ FAQItem) {
    this.FAQ.add(FAQItem);
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

  public FAQCollection lastModificationDate(Long lastModificationDate) {
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
    FAQCollection faQCollection = (FAQCollection) o;
    return Objects.equals(FAQ, faQCollection.FAQ) &&
        Objects.equals(lastModificationDate, faQCollection.lastModificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FAQ, lastModificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FAQCollection {\n");
    
    sb.append("    FAQ: ").append(toIndentedString(FAQ)).append("\n");
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

