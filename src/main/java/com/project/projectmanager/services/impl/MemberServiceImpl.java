package com.project.projectmanager.services.impl;


 
 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.MemberEntity;
import com.project.projectmanager.domain.TeamMemberEntitys;
import com.project.projectmanager.repositories.MemberRespository;
import com.project.projectmanager.services.MemberService;




@Service
public class MemberServiceImpl implements MemberService{

	private MemberRespository memberRepository;
	
	
	
	
	public MemberServiceImpl(MemberRespository _memberRepository) {
		this.memberRepository = _memberRepository;
	}

	@Override
	public MemberEntity createMember(String teamMemberName, MemberEntity _MemberName) {
		// TODO Auto-generated method stub
//		_MemberName.
		return memberRepository.save(_MemberName);
	}

	@Override
	public List<MemberEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(memberRepository
				.findAll()
				.spliterator(), false).collect(Collectors.toList());
														
	}

	@Override
	public Optional<MemberEntity> findOne(String _TeamMemberName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _teamMemberName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberEntity partialUpdate(String team_member_id, MemberEntity team_memberEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String team_member_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<MemberEntity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberEntity save(MemberEntity _member) {
		// TODO Auto-generated method stub
		return null;
	}}

