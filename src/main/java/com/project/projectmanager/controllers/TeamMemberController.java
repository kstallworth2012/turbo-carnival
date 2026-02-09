package com.project.projectmanager.controllers;

 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.PutMapping;
 import org.springframework.web.bind.annotation.DeleteMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestBody; 
 import org.springframework.web.bind.annotation.ResponseStatus;
 import org.springframework.web.server.ResponseStatusException;

import com.project.projectmanager.domain.TeamMemberEntitys;
import com.project.projectmanager.domain.dto.TeamMemberDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.TeamMemberService;

//import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
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