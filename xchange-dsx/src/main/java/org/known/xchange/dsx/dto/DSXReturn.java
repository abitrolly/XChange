package org.known.xchange.dsx.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mikhail Wall
 */

public class DSXReturn<V> {

  private final boolean success;
  private final V returnValue;
  private final String error;

  @JsonCreator
  public DSXReturn(@JsonProperty("success") boolean success, @JsonProperty("return") V returnValue, @JsonProperty("error") String error) {

    this.success = success;
    this.returnValue = returnValue;
    this.error = error;
  }

  public boolean isSuccess() {

    return success;
  }

  public V getReturnValue() {

    return returnValue;
  }

  public String getError() {

    return error;
  }

  @Override
  public String toString() {

    return String.format("DSXReturn[%s: %s]", success ? "OK" : "error", success ? returnValue.toString() : error);
  }
}
