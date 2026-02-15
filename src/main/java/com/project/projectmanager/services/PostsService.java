package com.project.projectmanager.services;

 import com.project.projectmanager.domain.PostsEntity;

 import java.util.List;
 import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsService{



	 PostsEntity createPost(String postName, PostsEntity _post);
     
     List<PostsEntity> findAll();

     Optional<PostsEntity> findOne(String _postName);
     
     Page<PostsEntity> findAll(Pageable _pageable);
	
	 boolean isExists(String _postName);

    PostsEntity partialUpdate(String posts_id, PostsEntity _postsEntity);
    
    void delete(String posts_id);


}