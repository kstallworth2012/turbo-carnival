package com.project.projectmanager.repositories;

import com.project.projectmanager.domain.TeamsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRespository extends CrudRepository<TeamsEntity,Long>{}