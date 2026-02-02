package com.project.projectmanager.services;

import com.project.projectmanager.domain.ProjectEntity;
import java.util.List;
import java.util.Optional;

public interface ProjectService{

	ProjectEntity createUpdateProject(String project_id, ProjectEntity projectEntity);

	List<ProjectEntity> findAll();

	Optional<ProjectEntity> findOne(String project_id);

	boolean isExists(String project_id);

	ProjectEntity partialUpdate(String project_id, ProjectEntity projectEntity );

	void delete(String project_id);

}