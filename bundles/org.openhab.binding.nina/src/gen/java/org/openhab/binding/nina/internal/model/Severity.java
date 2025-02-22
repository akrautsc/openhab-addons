package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets Severity
 */
public enum Severity {
  
  EXTREME("Extreme"),
  
  SEVERE("Severe"),
  
  MODERATE("Moderate"),
  
  MINOR("Minor"),
  
  UNKNOWN("Unknown");

  private String value;

  Severity(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Severity fromValue(String value) {
    for (Severity b : Severity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

