package com.project.projectmanager.services;


import com.project.projectmanager.domain.TeamMemberEntitys;
import java.util.List;
import java.util.Optional;


public interface MemberService{
	
	TeamMemberEntitys createTeamMember(String teamMemberName, TeamMemberEntitys _teamMemberName);
     
    List<TeamMemberEntitys> findAll();

    Optional<TeamMemberEntitys> findOne(String _TeamMemberName);
	
	boolean isExists(String _teamMemberName);


	TeamMemberEntitys partialUpdate(String team_member_id, TeamMemberEntitys team_memberEntity );

	void delete(String team_member_id);

}