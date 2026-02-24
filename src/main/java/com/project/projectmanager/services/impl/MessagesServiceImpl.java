package com.project.projectmanager.services.impl;


import com.project.projectmanager.services.MessagesService;
import com.project.projectmanager.domain.MessagesEntity;
import com.project.projectmanager.repositories.MessageRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;



@Service
public class MessagesServiceImpl implements MessagesService {

	private MessageRepository messageRepository;
			
	public MessagesServiceImpl(MessageRepository _messageRepository){
		super();
		this.messageRepository = _messageRepository;
	}

	@Override
	public MessagesEntity createMessages(String messagesName, MessagesEntity _message)
	{ return null; }
     
    @Override
    public List<MessagesEntity> findAll(){ 
    	return StreamSupport.stream(messageRepository.findAll()
				.spliterator(), false).collect(Collectors.toList());
    	}

    @Override
    public Page<MessagesEntity> findAll(Pageable pageable){ return null; }

    @Override
    public Optional<MessagesEntity> findOne(String _messagesName){ 
    				return messageRepository.findById(null); 
    				}
	

	@Override
	public void delete(String _message_id) {

		System.out.println("Delete Message:  "+ _message_id);
		messageRepository.deleteById(null);
	}

	@Override
	public MessagesEntity save(MessagesEntity messagesEntity) {
		// TODO Auto-generated method stub
		return messageRepository.save(messagesEntity);
	}

	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return messageRepository.existsById(id);
	}

	@Override
	public MessagesEntity partialUpdate(Long id, MessagesEntity _message) {
		// TODO Auto-generated method stub
		return null;
	}
}