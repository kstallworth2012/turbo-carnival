package com.project.projectmanager.services.impl;


// import com.project.projectmanager.services.___;
 import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.projectmanager.domain.TimeCardEntity;
import com.project.projectmanager.services.TimeCardService;





@Service
public class TimeCardServiceImpl implements TimeCardService{

	@Override
	public TimeCardEntity createTimeCard(String _timecard_id, TimeCardEntity _timeCard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TimeCardEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TimeCardEntity> findOne(String _timeCard) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Page<TimeCardEntity> finadAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExists(String _timeCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TimeCardEntity partialUpdate(String timeCard_id, TimeCardEntity _timeCardEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String timeCard_id) {
		// TODO Auto-generated method stub
		
	}
	
}

