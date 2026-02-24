package com.project.projectmanager.services;


import com.project.projectmanager.domain.MemberEntity;
import com.project.projectmanager.domain.TeamMemberEntitys;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MemberService{
	
	MemberEntity createMember(String MemberName, MemberEntity _MemberName);
	
	MemberEntity save(MemberEntity _member);
     
    List<MemberEntity> findAll();

    Optional<MemberEntity> findOne(String _MemberName);
	
	boolean isExists(String MemberName);
	Page<MemberEntity> findAll(Pageable _pageable);

	MemberEntity partialUpdate(String _member_id, MemberEntity memberEntity );

	void delete(String team_member_id);

}