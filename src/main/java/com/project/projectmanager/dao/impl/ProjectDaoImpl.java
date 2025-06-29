package com.project.projectmanager.dao.impl;



com.project.projectmanager.dao.ProjectDao;

import org.springframework.jdbc.core.JdbcTemplate;




public class ProjectDaoImpl implements ProjectDao{


		private Final JdbcTemplate jdbcTemplate;


	public ProjectDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}


}