package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.TeamsDto;
 import    com.project.projectmanager.domain.TeamsEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


 @Component
public class TeamMapperImpl implements Mapper<TeamsEntity, TeamsDto>{
	
     private ModelMapper model_Mapper;

     public TeamMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
     
 	@Override
 	public TeamsDto mapTo(TeamsEntity object){
 	    return model_Mapper.map(object, TeamsDto.class);
 	}


 	@Override 
 	public TeamsEntity mapFrom(TeamsDto dto){
 	   return model_Mapper.map(dto, TeamsEntity.class);
 	}
 }