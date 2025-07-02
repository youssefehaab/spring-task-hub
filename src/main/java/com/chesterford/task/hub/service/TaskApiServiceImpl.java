package com.chesterford.task.hub.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.chesterford.task.hub.api.TasksApiService;
import com.chesterford.task.hub.dto.TaskCreateRequestDto;
import com.chesterford.task.hub.dto.TaskDto;
import com.chesterford.task.hub.dto.TaskUpdateRequestDto;
import com.chesterford.task.hub.mapper.TaskMapper;
import com.chesterford.task.hub.repository.TaskRepository;
import com.chesterford.task.hub.util.exception.ResourceNotFoundException;

@Service
@RequiredArgsConstructor
public class TaskApiServiceImpl implements TasksApiService {

  private final TaskRepository taskRepository;
  private final TaskMapper taskMapper;

  @Override
  public List<TaskDto> getTasks() {
    return taskRepository.findAll().parallelStream().map(taskMapper::mapToDto).toList();
  }

  @Override
  public TaskDto createTask(TaskCreateRequestDto taskCreateRequestDto) {
    var task = taskMapper.mapToEntity(taskCreateRequestDto);
    taskRepository.save(task);
    return taskMapper.mapToDto(task);
  }

  @Override
  public Void deleteTaskById(UUID taskId) {
    if (taskRepository.existsById(taskId)) {
      taskRepository.deleteById(taskId);
      return null;
    } else {
      throw new ResourceNotFoundException(String.format("Task ID: %s is not found", taskId));
    }
  }

  @Override
  public TaskDto getTaskById(UUID taskId) {
    var task = taskRepository.findById(taskId).orElseThrow(
        () -> new ResourceNotFoundException(String.format("Task ID: %s is not found", taskId))
    );
    return taskMapper.mapToDto(task);
  }

  @Override
  public TaskDto updateTaskById(UUID taskId, TaskUpdateRequestDto taskUpdateRequestDto) {
    var task = taskRepository.findById(taskId).orElseThrow(
        () -> new ResourceNotFoundException(String.format("Task ID: %s is not found", taskId))
    );
    var taskDto = taskMapper.mapToDto(task);
    taskDto.setStatus(taskUpdateRequestDto.getStatus());
    var updatedTask = taskMapper.mapToEntity(taskDto);
    taskRepository.save(updatedTask);
    return taskDto;
  }

}
