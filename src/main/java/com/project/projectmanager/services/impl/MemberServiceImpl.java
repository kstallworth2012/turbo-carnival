package com.project.projectmanager.services.impl;


 
 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.TeamMemberEntitys;
import com.project.projectmanager.services.MemberService;




@Service
public class MemberServiceImpl implements MemberService{

	@Override
	public TeamMemberEntitys createTeamMember(String teamMemberName, TeamMemberEntitys _teamMemberName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamMemberEntitys> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TeamMemberEntitys> findOne(String _TeamMemberName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _teamMemberName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TeamMemberEntitys partialUpdate(String team_member_id, TeamMemberEntitys team_memberEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String team_member_id) {
		// TODO Auto-generated method stub
		
	}}

