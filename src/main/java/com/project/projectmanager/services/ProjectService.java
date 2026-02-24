package com.project.projectmanager.services;

import com.project.projectmanager.domain.ProjectEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProjectService{

	ProjectEntity createUpdateProject(Long project_id, ProjectEntity projectEntity);
	
	ProjectEntity save(ProjectEntity _project);

	List<ProjectEntity> findAll();

	Page<ProjectEntity> findAll(Pageable pageable);

	Optional<ProjectEntity> findOne(Long project_id);

	boolean isExists(Long project_id);

	ProjectEntity partialUpdate(Long project_id, ProjectEntity projectEntity );

	void delete(Long project_id);

}