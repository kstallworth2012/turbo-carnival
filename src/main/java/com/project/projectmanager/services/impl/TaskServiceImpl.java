package com.project.projectmanager.services.impl;

import com.project.projectmanager.domain.TaskEntity;
import com.project.projectmanager.services.TaskService;

 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




@Service
public class TaskServiceImpl implements TaskService {

	@Override
	public TaskEntity createTask(Long taskId, TaskEntity _task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskEntity save(TaskEntity _task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TaskEntity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TaskEntity> findOne(Long _taskId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(Long _taskName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TaskEntity partialUpdate(Long taskID, TaskEntity _task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long _taskId) {
		// TODO Auto-generated method stub
		
	}
}




// @Override
// public List<Task> findAll(){

// 	return StreamSupport
// 			.stream(
// 					taskRespository.findAll().splititerator(), false)
// 					.collect(Collectors.toList());
			
// }


// @Override
// public Optional<Task> findOne(String taskName){
// 	return taskRespository.findById(taskName);
// }

// @Override
// public boolean isExists(String taskName){
// 	return taskRespository.existsById(taskName);
// }


// @Override
// public Task partialUpdate(String taskName, Task _task){
	
// 	Task.setTaskName(taskName);

// 	return taskRespository.findById(taskName).map(existingTask -> {
// 		Optional.ofNullable(task.getTaskName()).ifPresent(existingTask::setTaskName);
// 	}).orElsThrow(() -> new RuntimeException("Task does not exists"));

// 	return null; 
	// }
// }
