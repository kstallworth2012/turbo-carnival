package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.projectmanager.domain.ProjectEntity;


@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity,Long>{}
