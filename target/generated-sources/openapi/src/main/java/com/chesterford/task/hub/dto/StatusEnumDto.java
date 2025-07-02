package com.chesterford.task.hub.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets StatusEnum
 */

@Generated(value = "com.chesterford.FastSpringCodegen", date = "2025-06-26T21:18:37.398383+08:00[Asia/Kuala_Lumpur]", comments = "Generator version: 7.11.0")
public enum StatusEnumDto {
  
  PENDING("PENDING"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED");

  private final String value;

  StatusEnumDto(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusEnumDto fromValue(String value) {
    for (StatusEnumDto b : StatusEnumDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

