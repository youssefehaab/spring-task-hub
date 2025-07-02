package com.chesterford.task.hub.mapper;

import com.chesterford.task.hub.dto.TaskCreateRequestDto;
import com.chesterford.task.hub.dto.TaskDto;
import com.chesterford.task.hub.model.Task;
import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-26T21:18:45+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task mapToEntity(TaskDto taskDto) {
        if ( taskDto == null ) {
            return null;
        }

        Task task = new Task();

        task.setId( taskDto.getId() );
        task.setTitle( taskDto.getTitle() );
        task.setDescription( taskDto.getDescription() );
        task.setStatus( taskDto.getStatus() );
        task.setAssignedTo( taskDto.getAssignedTo() );
        if ( taskDto.getDueDate() != null ) {
            task.setDueDate( taskDto.getDueDate().toString() );
        }
        task.setCreatedAt( taskDto.getCreatedAt() );
        task.setUpdatedAt( taskDto.getUpdatedAt() );

        return task;
    }

    @Override
    public TaskDto mapToDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setId( task.getId() );
        taskDto.setTitle( task.getTitle() );
        taskDto.setDescription( task.getDescription() );
        taskDto.setStatus( task.getStatus() );
        taskDto.setAssignedTo( task.getAssignedTo() );
        if ( task.getDueDate() != null ) {
            taskDto.setDueDate( Instant.parse( task.getDueDate() ) );
        }
        taskDto.setCreatedAt( task.getCreatedAt() );
        taskDto.setUpdatedAt( task.getUpdatedAt() );

        return taskDto;
    }

    @Override
    public Task mapToEntity(TaskCreateRequestDto taskCreateRequestDto) {
        if ( taskCreateRequestDto == null ) {
            return null;
        }

        Task task = new Task();

        task.setTitle( taskCreateRequestDto.getTitle() );
        task.setDescription( taskCreateRequestDto.getDescription() );
        task.setAssignedTo( taskCreateRequestDto.getAssignedTo() );
        if ( taskCreateRequestDto.getDueDate() != null ) {
            task.setDueDate( taskCreateRequestDto.getDueDate().toString() );
        }

        task.setStatus( com.chesterford.task.hub.dto.StatusEnumDto.PENDING );

        return task;
    }
}
