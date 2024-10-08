package org.openhab.binding.nina.internal.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeyValueArrayInner  {
  
  private String valueName;

  private String value;
 /**
   * Get valueName
   * @return valueName
  **/
  @JsonProperty("valueName")
  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }

  public KeyValueArrayInner valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public KeyValueArrayInner value(String value) {
    this.value = value;
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
    KeyValueArrayInner keyValueArrayInner = (KeyValueArrayInner) o;
    return Objects.equals(valueName, keyValueArrayInner.valueName) &&
        Objects.equals(value, keyValueArrayInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValueArrayInner {\n");
    
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

