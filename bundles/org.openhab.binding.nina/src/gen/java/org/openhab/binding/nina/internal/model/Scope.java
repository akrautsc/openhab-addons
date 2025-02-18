package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets Scope
 */
public enum Scope {
  
  PUBLIC("Public"),
  
  RESTRICTED("Restricted"),
  
  PRIVATE("Private");

  private String value;

  Scope(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Scope fromValue(String value) {
    for (Scope b : Scope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

