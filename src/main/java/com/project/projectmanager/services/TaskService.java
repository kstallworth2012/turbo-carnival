package com.project.projectmanager.services;



import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//Task Entity
import com.project.projectmanager.domain.TaskEntity;

public interface TaskService{


	TaskEntity createTask(Long taskId, TaskEntity _task);
	
	TaskEntity save(TaskEntity _task);
     
    List<TaskEntity> findAll();

    //This is pagenation .... look in repository package
    Page<TaskEntity> findAll(Pageable _pageable);

    Optional<TaskEntity> findOne(Long _taskId);


    boolean isExists(Long _taskName);

    TaskEntity partialUpdate(Long taskID, TaskEntity _task);

    void delete(Long _taskId);

}



