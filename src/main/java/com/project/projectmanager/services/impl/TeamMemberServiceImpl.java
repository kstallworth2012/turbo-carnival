package com.project.projectmanager.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.TeamMemberEntitys;
import com.project.projectmanager.services.TeamMemberService;


@Service
public class TeamMemberServiceImpl implements TeamMemberService {

	@Override
	public TeamMemberEntitys createTeamMember(Long teamMemberName, TeamMemberEntitys _teamMemberName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamMemberEntitys save(TeamMemberEntitys _teamMember) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamMemberEntitys> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TeamMemberEntitys> findOne(Long _TeamMemberName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Page<TeamMemberEntitys> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExists(Long _teamMemberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TeamMemberEntitys partialUpdate(Long teamMember_id, TeamMemberEntitys team_member_entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long team_member_id) {
		// TODO Auto-generated method stub

	}

}
