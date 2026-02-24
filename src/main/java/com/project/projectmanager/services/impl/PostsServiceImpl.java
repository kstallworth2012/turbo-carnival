package com.project.projectmanager.services.impl;


 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.PostsEntity;
import com.project.projectmanager.repositories.PostRespository;
import com.project.projectmanager.services.PostsService;



@Service
public class PostsServiceImpl implements PostsService {

	
	
	private PostRespository postRepository;
	
	
	
	
	
	
	public PostsServiceImpl(PostRespository _postRepository) {
		this.postRepository = _postRepository;
	}

	@Override
	public PostsEntity createPost(String postName, PostsEntity _post) {
		// TODO Auto-generated method stub
		return postRepository.save(_post);
	}

	@Override
	public List<PostsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(postRepository.findAll()
				.spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public Optional<PostsEntity> findOne(String _postName) {
		// TODO Auto-generated method stub
		return postRepository.findById(null);
	}

	@Override
	public Page<PostsEntity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExists(String _postName) {
		// TODO Auto-generated method stub
		return postRepository.existsById(null);
	}

	@Override
	public PostsEntity partialUpdate(String posts_id, PostsEntity _postsEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String posts_id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(null);
	}

	@Override
	public PostsEntity save(PostsEntity _posts) {
		// TODO Auto-generated method stub
		return postRepository.save(_posts);
	}}
