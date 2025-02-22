package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets Urgency
 */
public enum Urgency {
  
  IMMEDIATE("Immediate"),
  
  EXPECTED("Expected"),
  
  FUTURE("Future"),
  
  PAST("Past"),
  
  UNKNOWN("Unknown");

  private String value;

  Urgency(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Urgency fromValue(String value) {
    for (Urgency b : Urgency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

