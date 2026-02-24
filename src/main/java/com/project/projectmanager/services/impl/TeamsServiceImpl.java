package com.project.projectmanager.services.impl;


import com.project.projectmanager.services.TeamsService;
import com.project.projectmanager.domain.TeamsEntity;
import com.project.projectmanager.repositories.TeamsRespository;
// import com.project.projectmanager.repositories
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;


import org.springframework.stereotype.Service;

@Service
public class TeamsServiceImpl implements TeamsService {


	private TeamsRespository teamsRepository;

	public TeamsServiceImpl(TeamsRespository _teamsRepository){
		super();
		this.teamsRepository = _teamsRepository;
	}

	@Override
	public TeamsEntity createTeams(String teamName, TeamsEntity _team){

		return null;
	}
     
    @Override
    public List<TeamsEntity> findAll(){
    	return StreamSupport.stream(teamsRepository.findAll()
				.spliterator(), false).collect(Collectors.toList()); 
    }
    
    @Override
    public Optional<TeamsEntity> findOne(String _teamName) {
    	return null;
    }
	
	@Override
	public boolean isExists(String _teamName){ return false; }


	    //This is pagenation .... look in repository package
    
    @Override
    public Page<TeamsEntity> findAll(Pageable _pageable) {return null; };
    
    @Override
    public TeamsEntity partialUpdate(String taskName, TeamsEntity _team){
    	return null;
    };
    
    @Override
    public void delete(String _teamName){
    			System.out.println("DELETE TEAM "+_teamName);
    }

	@Override
	public TeamsEntity save(TeamsEntity _teams) {
		// TODO Auto-generated method stub
		return null;
	}
}
