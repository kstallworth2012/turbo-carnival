package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.ProjectDto;
 import    com.project.projectmanager.domain.ProjectEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;



// @Component
public class ProjectMapperImpl implements Mapper<ProjectEntity, ProjectDto>{
	
     private ModelMapper model_Mapper;

     public ProjectMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
     
     
 	@Override
 	public ProjectDto mapTo(ProjectEntity object){
 	    return model_Mapper.map(object, ProjectDto.class);
 	}


 	@Override 
 	public ProjectEntity mapFrom(ProjectDto dto){
 	   return model_Mapper.map(dto, ProjectEntity.class);
 	}
 }