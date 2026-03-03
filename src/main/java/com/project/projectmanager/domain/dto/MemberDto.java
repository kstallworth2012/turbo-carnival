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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getDisplayProfile() {
		return displayProfile;
	}

	public void setDisplayProfile(Boolean displayProfile) {
		this.displayProfile = displayProfile;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPHone() {
		return workPHone;
	}

	public void setWorkPHone(String workPHone) {
		this.workPHone = workPHone;
	}

	public String getMobilePHone() {
		return mobilePHone;
	}

	public void setMobilePHone(String mobilePHone) {
		this.mobilePHone = mobilePHone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	} 
	
	
	
	
	
	
}