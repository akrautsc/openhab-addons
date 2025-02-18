package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets Status
 */
public enum Status {
  
  ACTUAL("Actual"),
  
  EXERCISE("Exercise"),
  
  SYSTEM("System"),
  
  TEST("Test"),
  
  DRAFT("Draft");

  private String value;

  Status(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

