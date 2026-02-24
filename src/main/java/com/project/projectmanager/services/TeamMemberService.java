package com.project.projectmanager.services;

import com.project.projectmanager.domain.TeamMemberEntitys;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TeamMemberService{



	TeamMemberEntitys createTeamMember(Long teamMemberName, TeamMemberEntitys _teamMemberName);
	
	TeamMemberEntitys save(TeamMemberEntitys _teamMember);
     
    List<TeamMemberEntitys> findAll();

    Optional<TeamMemberEntitys> findOne(Long _TeamMemberName);
    
    Page<TeamMemberEntitys> findAll(Pageable _pageable);
	
	boolean isExists(Long _teamMemberId);
	
	TeamMemberEntitys partialUpdate(Long teamMember_id, TeamMemberEntitys team_member_entity);
	
	void delete(Long team_member_id);
}