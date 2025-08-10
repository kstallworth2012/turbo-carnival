package com.project.projectmanager.domain;


import com.project.projectmanager.domain.TeamsEntity;
import com.project.projectmanager.domain.MemberEntity;
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
@Table(name="teammembers")
public class TeamMemberEntitys{

 	@Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "team_member_id_seq)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
	TeamsEntity fkTeamID;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
	MemberEntity fkMemberID;

}