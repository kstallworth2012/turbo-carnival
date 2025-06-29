package com.project.projectmanager.dao.impl;


com.project.projectmanager.dao.TeamMemberDao;

import org.springframework.jdbc.core.JdbcTemplate;


public class TeamMemberDaoImpl implements TeamMemberDao{

		private Final JdbcTemplate jdbcTemplate;


	public TeamMemberDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}

} 