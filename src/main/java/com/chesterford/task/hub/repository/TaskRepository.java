package com.chesterford.task.hub.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.chesterford.task.hub.model.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {
  // Additional query methods can be defined here if needed
}
