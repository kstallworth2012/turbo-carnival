package com.project.projectmanager.dao.impl;


import com.project.projectmanager.dao.TeamDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class TeamDaoImpl implements TeamDao{
	private Final sJdbcTemplate jdbcTemplate;


	public TeamDaoImpl(JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}

}