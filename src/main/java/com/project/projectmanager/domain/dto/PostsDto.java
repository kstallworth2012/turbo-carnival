package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.TeamsEntity;
import com.project.projectmanager.domain.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostsDto{


	 		
		private Long id;
    	private MemberEntity fkAuthorID;
    	private TeamsEntity fkTeamID;
  	
    	private Long fkOriginalPostId;

    	private LocalDateTime PostDate;
    	private String Subject;
    	private String PostMessageText;

}