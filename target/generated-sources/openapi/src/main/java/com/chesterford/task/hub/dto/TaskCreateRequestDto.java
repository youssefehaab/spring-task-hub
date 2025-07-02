package com.chesterford.task.hub.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskCreateRequestDto
 */

@JsonTypeName("TaskCreateRequest")
@Generated(value = "com.chesterford.FastSpringCodegen", date = "2025-06-26T21:18:37.398383+08:00[Asia/Kuala_Lumpur]", comments = "Generator version: 7.11.0")
public class TaskCreateRequestDto {

  private String title;

  private String description;

  private String assignedTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private java.time.Instant dueDate;

  public TaskCreateRequestDto() {
    super();
  }

  public TaskCreateRequestDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TaskCreateRequestDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskCreateRequestDto assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Get assignedTo
   * @return assignedTo
   */
  @NotNull 
  @Schema(name = "assignedTo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public TaskCreateRequestDto dueDate(java.time.Instant dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
   */
  @NotNull @Valid 
  @Schema(name = "dueDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dueDate")
  public java.time.Instant getDueDate() {
    return dueDate;
  }

  public void setDueDate(java.time.Instant dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreateRequestDto taskCreateRequest = (TaskCreateRequestDto) o;
    return Objects.equals(this.title, taskCreateRequest.title) &&
        Objects.equals(this.description, taskCreateRequest.description) &&
        Objects.equals(this.assignedTo, taskCreateRequest.assignedTo) &&
        Objects.equals(this.dueDate, taskCreateRequest.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, assignedTo, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreateRequestDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

