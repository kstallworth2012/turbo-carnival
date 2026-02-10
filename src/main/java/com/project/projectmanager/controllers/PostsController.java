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

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.project.projectmanager.domain.PostsEntity;
import com.project.projectmanager.domain.dto.PostsDto;
import com.project.projectmanager.mappers.Mapper;
import com.project.projectmanager.services.PostsService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
// import jakarta.validation.Valid;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList; 
 import java.util.List; 
 import java.util.Optional;
//



@RestController
@RequestMapping("/api/posts") 
public class PostsController{


 private PostsService postService;
 private Mapper<PostsEntity, PostsDto> postMapper;
 public PostsController(PostsService _postService,Mapper<PostsEntity, PostsDto> _postMapper){
     this.postService = _postService;
     this.postMapper = _postMapper;
 	}
 
 
 
 
 
 	@PostMapping(path="/new-post")
	public ResponseEntity<PostsDto> createPost(@RequestBody PostsDto _post) {
			PostsEntity postEntity = postMapper.mapFrom(_post);
			PostsEntity savedPostEntity = postService.createPost(null, postEntity);
			
			return new ResponseEntity<>(postMapper.mapTo(savedPostEntity), HttpStatus.CREATED);
	}
	
 
 
 
// 	@GetMapping(path="/")
//	public List<PostsDto> listPosts(){
//		List<PostsEntity> posts = postService.findAll();
//		return posts.stream()
//				.map(postMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<PostsDto> listPosts(Pageable page){
		Page<PostsEntity> posts = postService.findAll(page);
		return posts.map(postMapper::mapTo);
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
// public PostDto createPost(@RequestBody PostDto _postDTO){

//     return PostService.createPostx(_postDTO);


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