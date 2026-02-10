package com.project.projectmanager.controllers;

 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.PutMapping;
 import org.springframework.web.bind.annotation.DeleteMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestBody; 
 import org.springframework.web.bind.annotation.ResponseStatus;
 import org.springframework.web.server.ResponseStatusException;


import com.project.projectmanager.domain.TaskEntity;
import com.project.projectmanager.domain.dto.TaskDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.TaskService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;




 @RestController
 @RequestMapping("/api/tasks") 
public class TaskController{



 private TaskService taskService;
 private Mapper<TaskEntity, TaskDto> taskMapper;

 public TaskController(TaskService _taskservice,Mapper<TaskEntity, TaskDto> _taskMapper)
 {

     this.taskService = _taskservice;
     this.taskMapper = _taskMapper;
 }
     
 
 
  
  	@PostMapping(path="/new-task")
	public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto _task) {
			TaskEntity taskEntity = taskMapper.mapFrom(_task);
			TaskEntity savedTaskEntity = taskService.createTask(null, taskEntity);
			
			return new ResponseEntity<>(taskMapper.mapTo(savedTaskEntity), HttpStatus.CREATED);
	}
  
 
 
 
 
 //	@GetMapping(path="/")
//	public List<TaskDto> listTasks(){
//		List<TaskEntity> tasks = taskService.findAll();
//		return tasks.stream()
//				.map(applicantMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<TaskDto> listTasks(Pageable page){
		Page<TaskEntity> tasks = taskService.findAll(page);
		return tasks.map(taskMapper::mapTo);
	}
	
 
 
 
 
  
  
  	@GetMapping(path = "/{id}")
	public ResponseEntity<TaskDto> getTask(@PathVariable("id") String id){
		  Optional<TaskEntity> foundTask = taskService.findOne(id);
		  
		  
		  return foundTask.map(taskEntity -> {
			  		TaskDto taskDto = taskMapper.mapTo(taskEntity);
			  		return new ResponseEntity<>(taskDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
  
  
  
  
  
 
   
    
    @PutMapping(path="/{id}")
	public ResponseEntity<TaskDto> fullUpdateTask(@PathVariable("id") String id, @RequestBody TaskDto taskDto){
		
		if(!taskService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		taskDto.setId(id);
		TaskEntity taskEntity = taskMapper.mapFrom(taskDto);
		TaskEntity savedTaskEntity = taskService.save(taskEntity);
		
		return new ResponseEntity<>(taskMapper.mapTo(savedTaskEntity), HttpStatus.OK); 
		
	}	
	
    
    
    
    
    
   
     	@PatchMapping(path ="{/id}")
	public ResponseEntity<TaskDto> partialUpdate(@PathVariable("id") String id, @RequestBody TaskDto taskDto){
		
		if(!taskService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		TaskEntity taskEntity = taskMapper.mapFrom(taskDto);
		TaskEntity updatedTask = taskService.partialUpdate(id, taskEntity);
		
		return new ResponseEntity<>(taskMapper.mapTo(updatedTask), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<TaskDto> deleteApplicant(@PathVariable("id") String id) {
		
		taskService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

 
 
 
 
 
 
 
 
 
 		}
 
 
 
 // /*
// //find all members in all projects
// //@GetMapping("api/tasks")
// @GetMapping("")
// List<Tasks> findAll(){
//    return .findAll(); 
// }


// @GetMapping("/{id}")
// Tasks findById(@PathVariable Integer id){
    
// @Optional<> _ = TasksRepository.findById(id);
// if(_.isEmpty()){

// 	throw new RespponseStatusException(HttpStatus.NOT_FOUND,"Task not found.");
// }
//   return _member.get();

//   //  return membersRepository.findById(id).get();

// }

// */
// //post
// @ResponseStatus(HttpStatus.CREATED)  //201 status
// @PostMapping("")
// public TaskDto createTask(@RequestBody TaskDto _taskDTO){

//     taskService.createTask(_taskDTO);


// }

// //post
// @ResponseStatus(HttpStatus.CREATED)  //201 status
// @PostMapping("")
// public Dto create(@RequestBody Dto _DTO){

//     return Service.create(_DTO);


// }


// /*
// //put
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping(path="/tasks/{id}")
// public ResponseEntity<TaskDto> createUpdateTask(@PathVariable String _taskName, @RequestBody TaskDto _taskDto){


//     Task taskEntity = taskMapper.mapFrom(_taskDto);
//     boolean taskExists = taskService.isExists(_taskName);
//     Task savedTaskEntity = taskService.createUpdateTask(_taskName,taskEntity);
//     TaskDto savedUpdatedTaskDto = taskMapper.mapTo(savedTaskEntity);



//     if(taskExists){
//         return new ResponseEntity(savedUpdatedTaskDto, HttpStatus.OK);
//     }else{
//         return new ResponseEntity(savedUpdatedTaskDto, HttpStatus.CREATED);

//     }


// }

// //should it be task name?
// @PatchMapping(path = "/tasks/{id}")
// public ResponseEntity<TaskDto> partialUpdateTask(@PathVariable("id") String id,
//                                                 @RequestBody TaskDto){
    
//     if(!TaskService.isExists(id)){
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

//     }
//        Task taskEntity = taskMapper.mapfrom(taskDto);
//        Task updatedTaskEntity = taskServiice.partialUpdate(id,taskEntity);
//        return new ResponseEntity<>(
//                 taskMapper.mapTo(updatedTaskEntity), 
//                     HttpStatus.OK);


//  }




// //delete
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping("/{id}")
// void delete__(@RequestBody Object _object ,Integer _id){

//     //.delete(_,_id);


// }
// */
// }