package com.chesterford.task.hub.dto;

import java.net.URI;
import java.util.Objects;
import com.chesterford.task.hub.dto.StatusEnumDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskUpdateRequestDto
 */

@JsonTypeName("TaskUpdateRequest")
@Generated(value = "com.chesterford.FastSpringCodegen", date = "2025-06-26T21:18:37.398383+08:00[Asia/Kuala_Lumpur]", comments = "Generator version: 7.11.0")
public class TaskUpdateRequestDto {

  private StatusEnumDto status;

  public TaskUpdateRequestDto() {
    super();
  }

  public TaskUpdateRequestDto status(StatusEnumDto status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnumDto getStatus() {
    return status;
  }

  public void setStatus(StatusEnumDto status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdateRequestDto taskUpdateRequest = (TaskUpdateRequestDto) o;
    return Objects.equals(this.status, taskUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdateRequestDto {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

