package com.project.projectmanager.dao.impl;


com.project.projectmanager.dao.MemberDao;
import org.springframework.jdbc.core.JdbcTemplate;


public class MemberDaoImpl implements MemberDao{



		private Final JdbcTemplate jdbcTemplate;


	public MemberDaoImpl(Final JdbcTemplate _jdbcTemplate){

		this.jdbcTemplate = _jdbcTemplate;
	}

}