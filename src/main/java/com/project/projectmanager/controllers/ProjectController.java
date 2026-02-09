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

import com.project.projectmanager.domain.ProjectEntity;
import com.project.projectmanager.domain.dto.ProjectDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.ProjectService;

import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
 import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;

@RestController
@RequestMapping("/api/projects") 
public class ProjectController{


 private ProjectService projectService;

private Mapper<ProjectEntity,ProjectDto> projectMapper;


 public ProjectController(ProjectService _projectService,Mapper<ProjectEntity,ProjectDto> _projectMapper){
     this.projectService = _projectService;
     this.projectMapper = _projectMapper;
 }


 }

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


// //post
// @ResponseStatus(HttpStatus.CREATED)  //201 status
// @PostMapping("")
// public ProjectDto createProject(@RequestBody ProjectDto _projectDTO){

//     return ProjectService.createProject(_projectDTO);


// }





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



