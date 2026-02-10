package com.project.projectmanager.services;

 import com.project.projectmanager.domain.PostsEntity;

 import java.util.List;
 import java.util.Optional;

public interface PostsService{



	 PostsEntity createPost(String postName, PostsEntity _post);
     
     List<PostsEntity> findAll();

     Optional<PostsEntity> findOne(String _postName);
	
	 boolean isExists(String _postName);




}