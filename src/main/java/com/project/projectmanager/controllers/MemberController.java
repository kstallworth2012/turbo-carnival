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

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.project.projectmanager.domain.MemberEntity;
import com.project.projectmanager.domain.dto.MemberDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.MemberService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
// import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;




@RestController
@RequestMapping("/api/members") 
public class MemberController{


private MemberService memberService;
private Mapper<MemberEntity, MemberDto> memberMapper;

 public MemberController(MemberService _memberService, Mapper<MemberEntity, MemberDto> _memberMapper){
     this.memberService = _memberService;
     this.memberMapper = _memberMapper;
 }

 
 
 
	@PostMapping(path="/new-member")
	public ResponseEntity<MemberDto> createMember(@RequestBody MemberDto _member) {
			MemberEntity memberEntity = memberMapper.mapFrom(_member);
			MemberEntity savedMemberEntity = memberService.createMember(null, memberEntity);
			
			return new ResponseEntity<>(memberMapper.mapTo(savedMemberEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<MemberDto> listMembers(){
//		List<Applicant> applicants = memberService.findAll();
//		return applicants.stream()
//				.map(memberMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<MemberDto> listMembers(Pageable page){
		Page<MemberEntity> applicants = memberService.findAll(page);
		return applicants.map(memberMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<MemberDto> getMember(@PathVariable("id") String id){
		  Optional<MemberEntity> foundMember = memberService.findOne(id);
		  
		  
		  return foundApplicant.map(appEntity -> {
			  		MemberDto memberDto = memberMapper.mapTo(memberEntity);
			  		return new ResponseEntity<>(memberDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<MemberDto> fullUpdateMember(@PathVariable("id") String id, @RequestBody MemberDto memberDto){
		
		if(!memberService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		memberDto.setId(id);
		MemberEntity memberEntity = memberMapper.mapFrom(memberDto);
		MemberEntity savedMemberEntity = memberService.save(memberEntity);
		
		return new ResponseEntity<>(memberMapper.mapTo(savedMemberEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<MemberDto> partialUpdate(@PathVariable("id") String id, @RequestBody MemberDto memberDto){
		
		if(!memberService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		MemberEntity memberEntity = memberMapper.mapFrom(memberDto);
		MemberEntity updatedMember = memberService.partialUpdate(id, memberEntity);
		
		return new ResponseEntity<>(memberMapper.mapTo(updatedMember), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<MemberDto> deleteMember(@PathVariable("id") String id) {
		
		memberService.delete(id);
		
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
// public MemberDto create(@RequestBody Dto _memberDTO){

//     return MemberService.createMember(_memberDTO);


// }



// /*

// //put
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping("/{id}")
// void updateTask(@RequestBody Object _object,Integer _id){

//     Repository.update__(_object,_id);


// }
// //delete
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping("/{id}")
// void delete__(@RequestBody Object _object ,Integer _id){

//     //.delete(_,_id);


// }

// */



// }