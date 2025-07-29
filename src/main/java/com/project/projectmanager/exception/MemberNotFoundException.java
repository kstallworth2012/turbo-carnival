package com.project.projectmanager.exception;


// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.ResponseStatus;


// @RequestStatus(HttpStatus.NOT_FOUND) //404
public class MemberNotFoundException extends RuntimeException{

	 public MemberNotFoundException(){
		super("Member Not Found");
		}
}