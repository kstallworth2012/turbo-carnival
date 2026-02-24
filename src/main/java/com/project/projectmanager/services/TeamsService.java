package com.project.projectmanager.services;


import com.project.projectmanager.domain.TeamsEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface TeamsService{




	TeamsEntity createTeams(Long teamId, TeamsEntity _team);
	
	TeamsEntity save(TeamsEntity _teams);
     
    List<TeamsEntity> findAll();

    Optional<TeamsEntity> findOne(Long _teamId);
	
	boolean isExists(Long _teamId);


	    //This is pagenation .... look in repository package
    Page<TeamsEntity> findAll(Pageable _pageable);

    TeamsEntity partialUpdate(Long taskId, TeamsEntity _task);

    void delete(Long _taskId);
}