package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.TeamMemberDto;
 import    com.project.projectmanager.domain.TeamMemberEntitys;
 import    com.project.projectmanager.mappers.Mapper;
 import org.modelmapper.ModelMapper;



// @Component
public class TeamMemberMapperImpl implements Mapper<TeamMemberEntitys, TeamMemberDto>{
	
     private ModelMapper model_Mapper;

     public TeamMemberMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
 	@Override
 	public TeamMemberDto mapTo(TeamMemberEntitys object){
 	    return model_Mapper.map(object, TeamMemberDto.class);
 	}


 	@Override 
 	public TeamMemberEntitys mapFrom(TeamMemberDto dto){
 	   return model_Mapper.map(dto, TeamMemberEntitys.class);
 	}
 }