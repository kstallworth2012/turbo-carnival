package com.project.projectmanager.services;


import com.project.projectmanager.domain.TeamMember;
import java.util.List;
import java.util.Optional;


public interface MemberService{
	
	TeamMember createTeamMember(String teamMemberName, TeamMember _teamMemberName);
     
    List<TeamMember> findAll();

    Optional<TeamMember> findOne(String _TeamMemberName);
	
	boolean isExists(String _teamMemberName);
}