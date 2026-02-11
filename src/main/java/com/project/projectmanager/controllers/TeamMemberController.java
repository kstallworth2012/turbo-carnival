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
import com.project.projectmanager.domain.TeamMemberEntitys;
import com.project.projectmanager.domain.dto.TeamMemberDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.TeamMemberService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;



 @RestController
 @RequestMapping("/api/team-members") 
public class TeamMemberController{


 private TeamMemberService teamMemberService;
 
 private Mapper<TeamMemberEntitys, TeamMemberDto> teamMemberMapper;

 public TeamMemberController(TeamMemberService _teamMemberService,Mapper<TeamMemberEntitys, TeamMemberDto> _teamMemberMapper){

     this.teamMemberService = _teamMemberService;
     this.teamMemberMapper = _teamMemberMapper;
 }

 
 
 

 
 
 
	@PostMapping(path="/new-team-member")
	public ResponseEntity<TeamMemberDto> createTeamMember(@RequestBody TeamMemberDto _teamMember) {
			TeamMemberEntitys teamMemberEntity = teamMemberMapper.mapFrom(_teamMember);
			TeamMemberEntitys savedTeamMemberEntity = teamMemberService.createTeamMember(null, teamMemberEntity);
			
			return new ResponseEntity<>(teamMemberMapper.mapTo(savedTeamMemberEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<TeamMemberDto> listTeamMembers(){
//		List<TeamMemberEntitys> teamMembers = teamMemberService.findAll();
//		return teamMembers.stream()
//				.map(teamMemberMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<TeamMemberDto> listTeamMembers(Pageable page){
		Page<TeamMemberEntitys> teamMembers = teamMemberService.findAll(page);
		return teamMembers.map(teamMemberMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<TeamMemberDto> getTeamMember(@PathVariable("id") String id){
		  Optional<TeamMemberEntitys> foundTeamMember = teamMemberService.findOne(id);
		  
		  
		  return foundTeamMember.map(teamMemberEntity -> {
			  		TeamMemberDto teamMemberDto = teamMemberMapper.mapTo(teamMemberEntity);
			  		return new ResponseEntity<>(teamMemberDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<TeamMemberDto> fullUpdateTeamMember(@PathVariable("id") String id, @RequestBody TeamMemberDto teamMemberDto){
		
		if(!teamMemberService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		teamMemberDto.setId(id);
		TeamMemberEntitys teamMemberEntity = teamMemberMapper.mapFrom(teamMemberDto);
		TeamMemberEntitys savedTeamMemberEntity = teamMemberService.save(teamMemberEntity);
		
		return new ResponseEntity<>(teamMemberMapper.mapTo(savedTeamMemberEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<TeamMemberDto> partialUpdate(@PathVariable("id") String id, @RequestBody TeamMemberDto teamMemberDto){
		
		if(!teamMemberService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		TeamMemberEntitys teamMemberEntity = teamMemberMapper.mapFrom(teamMemberDto);
		TeamMemberEntitys updatedTeamMember = teamMemberService.partialUpdate(id, teamMemberEntity);
		
		return new ResponseEntity<>(teamMemberMapper.mapTo(updatedTeamMember), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<TeamMemberDto> deleteTeamMember(@PathVariable("id") String id) {
		
		appService.delete(id);
		
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
// public TeamMemberDto create(@RequestBody TeamMemberDto _teamMemberDTO){

//     return TeamMemberService.create(_teamMemberDTO);


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

//        }
// */
// }