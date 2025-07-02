package com.chesterford.task.hub.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.chesterford.task.hub.config.MapperConfig;
import com.chesterford.task.hub.dto.TaskCreateRequestDto;
import com.chesterford.task.hub.dto.TaskDto;
import com.chesterford.task.hub.model.Task;

@Mapper(config = MapperConfig.class)
public interface TaskMapper {

  Task mapToEntity(TaskDto taskDto);

  TaskDto mapToDto(Task task);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "createdAt", ignore = true)
  @Mapping(target = "updatedAt", ignore = true)
  @Mapping(target = "status", expression = "java(com.chesterford.task.hub.dto.StatusEnumDto.PENDING)")
  Task mapToEntity(TaskCreateRequestDto taskCreateRequestDto);

}
