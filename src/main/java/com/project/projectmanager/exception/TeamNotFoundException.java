package com.project.projectmanager.exception;


// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.ResponseStatus;


// @RequestStatus(HttpStatus.NOT_FOUND) //404
public class TeamNotFoundException extends RuntimeException{

	 public TeamNotFoundException(){
		super("Team Not Found");
		}
}