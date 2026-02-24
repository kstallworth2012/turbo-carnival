package com.project.projectmanager.services.impl;


import com.project.projectmanager.domain.ProjectEntity;
import com.project.projectmanager.repositories.ProjectRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.projectmanager.services.ProjectService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {



	private ProjectRepository projectRepository;

	public ProjectServiceImpl(ProjectRepository projectRepository){
		super();
		this.projectRepository = projectRepository;
	}


	@Override
	public ProjectEntity createUpdateProject(String project_id, ProjectEntity projectEntity){
		return null;
	}
	
	@Override
	public List<ProjectEntity> findAll(){
		return StreamSupport.stream(projectRepository.findAll()
				.spliterator(), false).collect(Collectors.toList());
	}
	
	@Override
	public Page<ProjectEntity> findAll(Pageable pageable){
		return null;
	}
	
	@Override
	public Optional<ProjectEntity> findOne(String project_id){
		return null;
	}
	
	@Override
	public boolean isExists(String project_id){
		return false; 
	}
	
	@Override
	public ProjectEntity partialUpdate(String project_id, ProjectEntity projectEntity ){
		return null;
	}
	
	@Override
	public void delete(String project_id){
	
        System.out.println("DELETE PROJECT"); 
	}


	@Override
	public ProjectEntity save(ProjectEntity _project) {
		// TODO Auto-generated method stub
		return null;
	}




}
