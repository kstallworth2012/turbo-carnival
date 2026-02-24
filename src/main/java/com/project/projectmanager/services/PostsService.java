package com.project.projectmanager.services;

 import com.project.projectmanager.domain.PostsEntity;

 import java.util.List;
 import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsService{



	 PostsEntity createPost(Long postName, PostsEntity _post);
	 
	 PostsEntity save(PostsEntity _posts);
     
     List<PostsEntity> findAll();

     Optional<PostsEntity> findOne(Long _postId);
     
     Page<PostsEntity> findAll(Pageable _pageable);
	
	 boolean isExists(Long _postId);

    PostsEntity partialUpdate(Long posts_id, PostsEntity _postsEntity);
    
    void delete(Long posts_id);


}