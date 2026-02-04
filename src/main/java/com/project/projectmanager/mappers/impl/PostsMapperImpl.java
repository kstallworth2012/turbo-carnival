package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.PostsDto;
 import    com.project.projectmanager.domain.PostsEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;


// @Component
public class PostsMapperImpl implements Mapper<PostsEntity, PostsDto>{
	
     private ModelMapper model_Mapper;

     public PostsMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
 	@Override
 	public PostsDto mapTo(PostsEntity object){
 	    return model_Mapper.map(object, PostsDto.class);
 	}


 	@Override 
 	public PostsEntity mapFrom(PostsDto dto){
 	   return model_Mapper.map(dto, PostsEntity.class);
 	}
 }