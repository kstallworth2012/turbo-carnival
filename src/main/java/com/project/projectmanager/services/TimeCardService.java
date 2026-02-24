package com.project.projectmanager.services;

import com.project.projectmanager.domain.TimeCardEntity;

// import com.project.projectmanager.domain.Timecard;
 import java.util.List;
 import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TimeCardService{


	 TimeCardEntity createTimeCard(Long _timecard_id, TimeCardEntity _timeCard);
	 
	 TimeCardEntity save(TimeCardEntity _timeCard);
	 
	 List<TimeCardEntity> findAll();
	 
	 Optional<TimeCardEntity> findOne(Long _timeCard);
	 
	 Page<TimeCardEntity> findAll(Pageable pageable);
	 
	 boolean isExists(Long _timeCard);
	 
	 TimeCardEntity partialUpdate(Long timeCard_id, TimeCardEntity _timeCardEntity);
	 
	 void delete(Long timeCard_id);
}
