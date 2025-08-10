package com.project.projectmanager.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto{


	private Long id;
	
	private String firstName;
    	
	private String lastName;
    	
	private String email;
    	
	private String userName;
    	
	private String password;
    	
	private Boolean displayProfile; 
    	
	private String homePage; 
    	
	private String homePhone; 
    	
	private String workPHone; 
    	
	private String mobilePHone; 
    	
	private String fax; 
    	
	private String aboutMe; 
}