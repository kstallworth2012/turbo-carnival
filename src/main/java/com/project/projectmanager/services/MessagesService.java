package com.project.projectmanager.services;


import com.project.projectmanager.domain.MessagesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface MessagesService{




	MessagesEntity createMessages(String messagesName, MessagesEntity _message);
	
     
    List<MessagesEntity> findAll();


    Page<MessagesEntity> findAll(Pageable pageable);


    Optional<MessagesEntity> findOne(String _messagesName);
	

	boolean isExists(Long id);

	MessagesEntity partialUpdate(Long id, MessagesEntity _message );

	void delete(String _message_id);

	MessagesEntity save(MessagesEntity messagesEntity);


}