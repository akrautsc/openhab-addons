package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets Category
 */
public enum Category {
  
  GEO("Geo"),
  
  MET("Met"),
  
  SAFETY("Safety"),
  
  SECURITY("Security"),
  
  RESCUE("Rescue"),
  
  FIRE("Fire"),
  
  HEALTH("Health"),
  
  ENV("Env"),
  
  TRANSPORT("Transport"),
  
  INFRA("Infra"),
  
  CBRNE("CBRNE");

  private String value;

  Category(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Category fromValue(String value) {
    for (Category b : Category.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

