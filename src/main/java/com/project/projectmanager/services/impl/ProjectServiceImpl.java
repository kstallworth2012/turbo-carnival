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
	public ProjectEntity createUpdateProject(Long project_id, ProjectEntity projectEntity){
		return projectRepository.save(projectEntity);
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
	public Optional<ProjectEntity> findOne(Long project_id){
		return null;
	}
	
	@Override
	public boolean isExists(Long project_id){
		return projectRepository.existsById(project_id); 
	}
	
	@Override
	public ProjectEntity partialUpdate(Long project_id, ProjectEntity projectEntity ){
		return null;
	}
	
	@Override
	public void delete(Long project_id){
		projectRepository.deleteById(project_id);
	
        System.out.println("DELETE PROJECT"); 
	}


	@Override
	public ProjectEntity save(ProjectEntity _project) {
		// TODO Auto-generated method stub
		return projectRepository.save(_project);
	}




}
