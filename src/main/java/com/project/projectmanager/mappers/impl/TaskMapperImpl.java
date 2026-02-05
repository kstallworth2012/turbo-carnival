 package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.TaskDto;
 import    com.project.projectmanager.domain.TaskEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import    org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;



 @Component
public class TaskMapperImpl implements Mapper<TaskEntity, TaskDto>{
	
     private ModelMapper modelMapper;

     public TaskMapperImpl(ModelMapper _modelMapper){
         this.modelMapper = _modelMapper; 
     }
     
 	@Override
 	public TaskDto mapTo(TaskEntity task_entity){
 	    return modelMapper.map(task_entity, TaskDto.class);
 	}


	 	@Override 
	 	public TaskEntity mapFrom(TaskDto task_dto){
	 	   return modelMapper.map(task_dto, TaskEntity.class);
	 	}
 }