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
	public Optional<MemberEntity> findOne(Long _memberName) {
		// TODO Auto-generated method stub
		return memberRepository.findById(_memberName);
	}

	@Override
	public boolean isExists(Long _memberName) {
		// TODO Auto-generated method stub
		return memberRepository.existsById(_memberName);
	}

	@Override
	public MemberEntity partialUpdate(Long team_member_id, MemberEntity team_memberEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long member_id) {
		// TODO Auto-generated method stub
		memberRepository.deleteById(member_id);
		
	}

	@Override
	public Page<MemberEntity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberEntity save(MemberEntity _member) {
		// TODO Auto-generated method stub
		return memberRepository.save(_member);
	}
	

}

