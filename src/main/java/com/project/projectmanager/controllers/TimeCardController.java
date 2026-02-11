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


import com.project.projectmanager.domain.TimeCardEntity;
import com.project.projectmanager.domain.dto.TimeCardDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.TimeCardService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;




@RestController
@RequestMapping("/api/timecards") 
public class TimeCardController{


 private TimeCardService timecardService;
private Mapper<TimeCardEntity,TimeCardDto> timeCardMapper;

 public TimeCardController(TimeCardService _timecardService,Mapper<TimeCardEntity,TimeCardDto> _timeCardMapper){
     this.timecardService = _timecardService;
     this.timeCardMapper = _timeCardMapper;
 } 

 
 
 
 
 
 
 
	@PostMapping(path="/new-timecard")
	public ResponseEntity<TimeCardDto> createTimeCard(@RequestBody TimeCardDto _timeCard) {
			TimeCardEntity timeCardEntity = timeCardMapper.mapFrom(_timeCard);
			TimeCardEntity savedTimeCardEntity = timecardService.createTimeCard(null, timeCardEntity);
			
			return new ResponseEntity<>(timeCardMapper.mapTo(savedTimeCardEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<TimeCardDto> listTimeCards(){
//		List<TimeCardEntity> timeCards = timeCardService.findAll();
//		return timeCards.stream()
//				.map(timeCardMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<TimeCardDto> listTimeCards(Pageable page){
		Page<TimeCardEntity> timeCards = timeCardService.findAll(page);
		return timeCards.map(timeCardMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<TimeCardDto> getTimeCard(@PathVariable("id") String id){
		  Optional<TimeCardEntity> foundTimeCard = timeCardService.findOne(id);
		  
		  
		  return foundTimeCard.map(timeCardEntity -> {
			  		TimeCardDto timeCardDto = timeCardMapper.mapTo(timeCardEntity);
			  		return new ResponseEntity<>(timeCardDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<TimeCardDto> fullUpdateTimeCard(@PathVariable("id") String id, @RequestBody TimeCardDto timeCardDto){
		
		if(!timeCardService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		timeCardDto.setId(id);
		TimeCardEntity timeCardEntity = timeCardMapper.mapFrom(timeCardDto);
		TimeCardEntity savedTimeCardEntity = timeCardService.save(timeCardEntity);
		
		return new ResponseEntity<>(timeCardMapper.mapTo(savedTimeCardEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<TimeCardDto> partialUpdate(@PathVariable("id") String id, @RequestBody TimeCardDto timeCardDto){
		
		if(!timeCardService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		TimeCardEntity timeCardEntity = timeCardMapper.mapFrom(timeCardDto);
		TimeCardEntity updatedTimeCard = timeCardService.partialUpdate(id, timeCardEntity);
		
		return new ResponseEntity<>(timeCardMapper.mapTo(updatedTimeCard), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<TimeCardDto> deleteApplicant(@PathVariable("id") String id) {
		
		timeCardService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

 
 
 
 
 
 
 

 }
