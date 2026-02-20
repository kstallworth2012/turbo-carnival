package com.project.projectmanager.services.impl;


 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.PostsEntity;
import com.project.projectmanager.repositories.PostRespository;
import com.project.projectmanager.services.PostsService;



@Service
public class PotsServiceImpl implements PostsService {

	
	
	private PostRespository postRepository;
	
	
	
	
	
	
	public PotsServiceImpl(PostRespository _postRepository) {
		this.postRepository = _postRepository;
	}

	@Override
	public PostsEntity createPost(String postName, PostsEntity _post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostsEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PostsEntity> findOne(String _postName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Page<PostsEntity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExists(String _postName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PostsEntity partialUpdate(String posts_id, PostsEntity _postsEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String posts_id) {
		// TODO Auto-generated method stub
		
	}}
