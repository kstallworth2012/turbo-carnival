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


import com.project.projectmanager.domain.MessagesEntity;
import com.project.projectmanager.domain.dto.MessagesDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.MessagesService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
// import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;



@RestController
@RequestMapping("/api/messages") 
public class MessagesController{


 private MessagesService messageService;
 private Mapper<MessagesEntity,MessagesDto> messageMapper;

 public MessagesController(MessagesService _messageService, Mapper<MessagesEntity,MessagesDto> _messageMapper){
     this.messageService = _messageService;
     this.messageMapper = _messageMapper;
 	}
 



 	@PostMapping(path="/new-message")
	public ResponseEntity<MessagesDto> createMessage(@RequestBody MessagesDto _message) {
			MessagesEntity messageEntity = messageMapper.mapFrom(_message);
			MessagesEntity savedMessageEntity = messageService.createMessages(null, messageEntity);
			
			return new ResponseEntity<>(messageMapper.mapTo(savedMessageEntity), HttpStatus.CREATED);
 		}
 	
 	
 	
 	
 	
 	
 	
 	//	@GetMapping(path="/")
//	public List<MessagesDto> listMessages(){
//		List<MessagesEntity> messages = messageService.findAll();
//		return applicants.stream()
//				.map(messagesMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<MessagesDto> listMessages(Pageable page){
		Page<MessagesEntity> messages = messageService.findAll(page);
		return messages.map(messageMapper::mapTo);
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
// public MessageDto createMessage(@RequestBody Dto _messageDTO){

//     return MessageService.createMessage(_messageDTO);


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