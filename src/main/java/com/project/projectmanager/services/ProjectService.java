package com.project.projectmanager.services;

import com.project.projectmanager.domain.ProjectEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProjectService{

	ProjectEntity createUpdateProject(String project_id, ProjectEntity projectEntity);
	
	ProjectEntity save(ProjectEntity _project);

	List<ProjectEntity> findAll();

	Page<ProjectEntity> findAll(Pageable pageable);

	Optional<ProjectEntity> findOne(String project_id);

	boolean isExists(String project_id);

	ProjectEntity partialUpdate(String project_id, ProjectEntity projectEntity );

	void delete(String project_id);

}