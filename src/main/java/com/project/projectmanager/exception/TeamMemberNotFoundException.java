package com.project.projectmanager.exception;


// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.RequestStatus;


// @RequestStatus(HttpStatus.NOT_FOUND) //404
public class TeamMemberNotFoundException extends RuntimeException{

	 public TeamMemberNotFoundException(){
		super("TeamMember Not Found");
		}
}