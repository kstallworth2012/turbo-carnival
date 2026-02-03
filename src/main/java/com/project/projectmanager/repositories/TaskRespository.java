package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.project.projectmanager.domain.TaskEntity;

@Repository
public interface TaskRespository  extends CrudRepository<TaskEntity,Long>{}
//PagingAndSortingRepository<Task, Long>{}