package com.project.projectmanager.services;


import com.project.projectmanager.domain.TeamsEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TeamsService{




	TeamsEntity createTeams(String teamName, Teams _team);
     
    List<TeamsEntity> findAll();

    Optional<TeamsEntity> findOne(String _teamName);
	
	boolean isExists(String _teamName);


	    //This is pagenation .... look in repository package
    Page<TeamsEntity> findAll(Pageable _pageable);

    TeamsEntity partialUpdate(String taskName, TeamsEntity _task);

    void delete(String _taskName);
}