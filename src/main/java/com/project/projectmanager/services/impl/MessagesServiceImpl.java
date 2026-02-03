package com.project.projectmanager.services.impl;


import com.project.projectmanager.services.MessagesService;
import com.project.projectmanager.domain.MessagesEntity;
// import com.project.projectmanager.repositories.MessageRespository;
import com.project.projectmanager.repositories.MessageRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;



@Service
public class MessagesServiceImpl implements MessagesService {

	private MessageRespository messageRepository;
			
	public MessagesServiceImpl(MessageRespository _messageRepository){
		super();
		this.messageRepository = _messageRepository;
	}

	@Override
	public MessagesEntity createMessages(String messagesName, MessagesEntity _message){ return null; }
     
    @Override
    public List<MessagesEntity> findAll(){ return null; }

    @Override
    public Page<MessagesEntity> findAll(Pageable pageable){ return null; }

    @Override
    public Optional<MessagesEntity> findOne(String _messagesName){ return null; }
	
    @Override
	public boolean isExists(String _message_id){ return false; }


	@Override
	public MessagesEntity partialUpdate(String _message_id, MessagesEntity _message );

	@Override
	public void delete(String _message_id) {

		System.out.println("Delete Message:  "+ _message_id);
	}
}