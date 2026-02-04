package com.project.projectmanager.mappers.impl;



 import    com.project.projectmanager.domain.dto.MemberDto;
 import    com.project.projectmanager.domain.MemberEntity;
 import    com.project.projectmanager.mappers.Mapper;
 import    org.modelmapper.ModelMapper;


// @Component
public class MemberMapperImpl implements Mapper<MemberEntity, MemberDto> {
	
     private ModelMapper model_Mapper;

     public MemberMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
	
	
 	@Override
 	public MemberDto mapTo(MemberEntity memberEntity){
 	    return model_Mapper.map(memberEntity, MemberDto.class);
 	}


 	@Override 
 	public MemberEntity mapFrom(MemberDto member_dto){
 	   return model_Mapper.map(member_dto, MemberEntity.class);
 	}
 }