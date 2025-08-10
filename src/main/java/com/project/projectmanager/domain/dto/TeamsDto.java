package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.TeamMemberEntitys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamsDto{



 	
	private Long id;
    	

   	private TeamMemberEntitys fkTeamLeaderID;
   	
	private String Name;
   	
	private String  Description;
}