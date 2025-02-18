package org.openhab.binding.nina.internal.model;



/**
 * Gets or Sets MsgType
 */
public enum MsgType {
  
  ALERT("Alert"),
  
  UPDATE("Update"),
  
  CANCEL("Cancel"),
  
  ACK("Ack"),
  
  ERROR("Error");

  private String value;

  MsgType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MsgType fromValue(String value) {
    for (MsgType b : MsgType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

