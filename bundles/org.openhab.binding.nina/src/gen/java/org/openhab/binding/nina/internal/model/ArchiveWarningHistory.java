package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.ArchiveWarningHistoryHistoryInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArchiveWarningHistory  {
  
  private List<ArchiveWarningHistoryHistoryInner> history;
 /**
   * Get history
   * @return history
  **/
  @JsonProperty("history")
  public List<ArchiveWarningHistoryHistoryInner> getHistory() {
    return history;
  }

  public void setHistory(List<ArchiveWarningHistoryHistoryInner> history) {
    this.history = history;
  }

  public ArchiveWarningHistory history(List<ArchiveWarningHistoryHistoryInner> history) {
    this.history = history;
    return this;
  }

  public ArchiveWarningHistory addHistoryItem(ArchiveWarningHistoryHistoryInner historyItem) {
    this.history.add(historyItem);
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
    ArchiveWarningHistory archiveWarningHistory = (ArchiveWarningHistory) o;
    return Objects.equals(history, archiveWarningHistory.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveWarningHistory {\n");
    
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

