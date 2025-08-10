package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.projectmanager.domain.PostsEntity;


// @Repository
public interface PostRespository extends CrudRepository<PostsEntity,Long>{}