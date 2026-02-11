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


import com.project.projectmanager.domain.TeamsEntity;
import com.project.projectmanager.domain.dto.TeamsDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.PostsService;
import com.project.projectmanager.services.TeamsService;

// import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;


@RestController
@RequestMapping("/api/teams") 
public class TeamController{


 private TeamsService teamService;
 private Mapper<TeamsEntity, TeamsDto> teamMapper;

 public TeamController(TeamsService _teamService,Mapper<TeamsEntity, TeamsDto> _teamMapper){
     this.teamService = _teamService;
 	 this.teamMapper = _teamMapper;
 }



	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<TeamsDto> getTeam(@PathVariable("id") String id){
		  Optional<TeamsEntity> foundTeam = teamService.findOne(id);
		  
		  
		  return foundTeam.map(teamEntity -> {
			  		TeamsDto teamDto = teamMapper.mapTo(teamEntity);
			  		return new ResponseEntity<>(teamDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<TeamsDto> fullUpdateTeam(@PathVariable("id") String id, @RequestBody TeamsDto teamDto){
		
		if(!teamService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		teamDto.setId(id);
		TeamsEntity teamEntity = teamMapper.mapFrom(teamDto);
		TeamsEntity savedTeamEntity = teamService.save(teamEntity);
		
		return new ResponseEntity<>(teamMapper.mapTo(savedTeamEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<TeamsDto> partialUpdate(@PathVariable("id") String id, @RequestBody TeamsDto teamDto){
		
		if(!teamService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		TeamsEntity teamEntity = teamMapper.mapFrom(teamDto);
		TeamsEntity updatedTeam = teamService.partialUpdate(id, teamEntity);
		
		return new ResponseEntity<>(teamMapper.mapTo(updatedTeam), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<TeamsDto> deleteApplicant(@PathVariable("id") String id) {
		
		teamService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

 

 }
