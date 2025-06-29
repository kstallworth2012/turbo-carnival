package com.project.projectmanager.dao.impl;


import com.project.projectmanager.dao.PostDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class PostDaoImpl implements PostDao {




	private Final JdbcTemplate jdbcTemplate;


	public PostDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}

}