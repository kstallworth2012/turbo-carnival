package com.project.projectmanager.dao.impl;

import com.project.projectmanager.dao.TaskDao;
import org.springframework.jdbc.core.JdbcTemplate;


public class TaskDaoImpl implements TaskDao {

	private Final JdbcTemplate jdbcTemplate;


	public TaskDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}


}