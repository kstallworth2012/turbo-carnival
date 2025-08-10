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
public class ProjectDto{




	    
	private Long project_id;
    private TeamsEntity fkTeamID;
    private MemberEntity fkCreatorID;
    private String Name;
    private String Description;
    private LocalDateTime StartDate;
    private LocalDateTime DueDate;
    private Boolean isCompleted;
}