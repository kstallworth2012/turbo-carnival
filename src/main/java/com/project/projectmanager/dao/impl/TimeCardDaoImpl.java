package com.project.projectmanager.dao.impl;

import com.project.projectmanager.dao.TimeCardDao;

import org.springframework.jdbc.core.JdbcTemplate;


public class TimeCardDaoImpl implements TimeCardDao{



private Final JdbcTemplate jdbcTemplate;



public TimeCardDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}



//MemberDaoImplTests.java	ProjectDaoImplTests.java TeamMemberDaoImplTests.java MessageDaoImplTests.java TaskDaoImplTests.java	TimeCardDaoImplTests.java PostDaoImplTests.java TeamDaoImplTests.java