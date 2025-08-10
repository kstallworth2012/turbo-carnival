package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.projectmanager.domain.MemberEntity;

@Repository
public interface MemberRespository extends CrudRepository<MemberEntity,Long>{}