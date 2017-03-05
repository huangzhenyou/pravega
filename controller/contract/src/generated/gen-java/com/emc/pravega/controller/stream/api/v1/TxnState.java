/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TxnState implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  OPEN(1),
  COMMITTING(2),
  COMMITTED(3),
  ABORTING(4),
  ABORTED(5);

  private final int value;

  private TxnState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TxnState findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return OPEN;
      case 2:
        return COMMITTING;
      case 3:
        return COMMITTED;
      case 4:
        return ABORTING;
      case 5:
        return ABORTED;
      default:
        return null;
    }
  }
}