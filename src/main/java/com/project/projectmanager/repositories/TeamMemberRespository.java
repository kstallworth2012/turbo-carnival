package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.projectmanager.domain.TeamMemberEntitys;

@Repository
public interface TeamMemberRespository extends CrudRepository<TeamMemberEntitys,Long>{}