package com.project.projectmanager.services;



import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//Task Entity
import com.project.projectmanager.domain.TaskEntity;

public interface TaskService{


	TaskEntity createTask(String taskName, TaskEntity _task);
     
    List<TaskEntity> findAll();

    //This is pagenation .... look in repository package
    Page<TaskEntity> findAll(Pageable _pageable);

    Optional<TaskEntity> findOne(String _taskName);


    boolean isExists(String _taskName);

    TaskEntity partialUpdate(String taskName, TaskEntity _task);

    void delete(String _taskName);

}



