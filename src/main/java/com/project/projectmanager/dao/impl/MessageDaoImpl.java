package com.project.projectmanager.dao.impl;



import com.project.projectmanager.dao.MessageDao;
import org.springframework.jdbc.core.JdbcTemplate;





public class MessageDaoImpl implements MessageDao{

	private Final JdbcTemplate jdbcTemplate;


	public MessageDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}


}