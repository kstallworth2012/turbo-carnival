package com.project.projectmanager.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="members")
public class MemberEntity{

 	@Id
	// //@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "member_id_seq)
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