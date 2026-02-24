package com.project.projectmanager.services;

import com.project.projectmanager.domain.TimeCardEntity;

// import com.project.projectmanager.domain.Timecard;
 import java.util.List;
 import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TimeCardService{


	 TimeCardEntity createTimeCard(String _timecard_id, TimeCardEntity _timeCard);
	 
	 TimeCardEntity save(TimeCardEntity _timeCard);
	 
	 List<TimeCardEntity> findAll();
	 
	 Optional<TimeCardEntity> findOne(String _timeCard);
	 
	 Page<TimeCardEntity> finadAll(Pageable pageable);
	 
	 boolean isExists(String _timeCard);
	 
	 TimeCardEntity partialUpdate(String timeCard_id, TimeCardEntity _timeCardEntity);
	 
	 void delete(String timeCard_id);
}
