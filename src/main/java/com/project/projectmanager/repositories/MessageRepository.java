package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.projectmanager.domain.MessagesEntity;


@Repository
public interface MessageRepository extends CrudRepository<MessagesEntity,Long>{}




