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

 
 /*
 
 
 
 
 
	@PostMapping(path="/new-applicant")
	public ResponseEntity<ApplicantDto> createApplicant(@RequestBody ApplicantDto _app) {
			Applicant appEntity = applicantMapper.mapFrom(_app);
			Applicant savedApplicantEntity = appService.createApplicant(null, appEntity);
			
			return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<ApplicantDto> listApplicants(){
//		List<Applicant> applicants = appService.findAll();
//		return applicants.stream()
//				.map(applicantMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<ApplicantDto> listApplicants(Pageable page){
		Page<Applicant> applicants = appService.findAll(page);
		return applicants.map(applicantMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<ApplicantDto> getApplicant(@PathVariable("id") String id){
		  Optional<Applicant> foundApplicant = appService.findOne(id);
		  
		  
		  return foundApplicant.map(appEntity -> {
			  		ApplicantDto appDto = applicantMapper.mapTo(appEntity);
			  		return new ResponseEntity<>(appDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> fullUpdateApplicant(@PathVariable("id") String id, @RequestBody ApplicantDto appDto){
		
		if(!appService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		appDto.setId(id);
		Applicant applicantEntity = applicantMapper.mapFrom(appDto);
		Applicant savedApplicantEntity = appService.save(applicantEntity);
		
		return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<ApplicantDto> partialUpdate(@PathVariable("id") String id, @RequestBody ApplicantDto appDto){
		
		if(!appService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Applicant applicantEntity = applicantMapper.mapFrom(appDto);
		Applicant updatedApplicant = appService.partialUpdate(id, applicantEntity);
		
		return new ResponseEntity<>(applicantMapper.mapTo(updatedApplicant), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

 
 
 
 
 
 */
 

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
// public TimeCardDto createTimeCard(@RequestBody TimeCardDto _timecardDTO){

//     return timecardService.createTimecard(_timecardDTO);


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