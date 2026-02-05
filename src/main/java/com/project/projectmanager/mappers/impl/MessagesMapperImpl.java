package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.MessagesDto;
 import    com.project.projectmanager.domain.MessagesEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


 @Component
public class MessagesMapperImpl implements Mapper<MessagesEntity, MessagesDto>{
	
     private ModelMapper model_Mapper;

     public MessagesMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
     
 	@Override
 	public MessagesDto mapTo(MessagesEntity object){
 	    return model_Mapper.map(object, MessagesDto.class);
 	}


 	@Override 
 	public MessagesEntity mapFrom(MessagesDto dto){
 	   return model_Mapper.map(dto, MessagesEntity.class);
 	}
 }