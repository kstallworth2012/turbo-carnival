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
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Members")
public class MemberEntity{

 	@Id
 	@Column(name="Id")
	private Long Id;
 	
 	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")	
	private String lastName;
	
	@Column(name="Email")	
	private String email;
	
	@Column(name="UserName")	
	private String userName;
	
	@Column(name="Password")	
	private String password;
	
	@Column(name="DisplayProfile")	
	private Boolean displayProfile; 
	
	@Column(name="HomePage")	
	private String homePage; 
	
	@Column(name="HomePhone")	
	private String homePhone; 
	
	@Column(name="WorkPHone")	
	private String workPHone; 
	
	@Column(name="MobilePHone")	
	private String mobilePHone; 
	
	@Column(name="Fax")	
	private String fax; 
	
	@Column(name="AboutMe")	
	private String aboutMe;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
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