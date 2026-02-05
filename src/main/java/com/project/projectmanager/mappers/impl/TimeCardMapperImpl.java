package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.TimeCardDto;
 import    com.project.projectmanager.domain.TimeCardEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


 @Component
public class TimeCardMapperImpl implements Mapper<TimeCardEntity, TimeCardDto>{
	
     private ModelMapper model_Mapper;

     public TimeCardMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
     
 	@Override
 	public TimeCardDto mapTo(TimeCardEntity object){
 	    return model_Mapper.map(object, TimeCardDto.class);
 	}


 	@Override 
 	public TimeCardEntity mapFrom(TimeCardDto dto){
 	   return model_Mapper.map(dto, TimeCardEntity.class);
 	}
 }