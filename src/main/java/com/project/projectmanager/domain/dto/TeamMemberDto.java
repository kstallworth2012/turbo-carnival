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
public class TeamMemberDto{



	private Long id;


	private TeamsEntity fkTeamID;


	private MemberEntity fkMemberID;
}