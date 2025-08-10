package com.project.projectmanager.domain;

import com.project.projectmanager.domain.TeamsEntity;
import com.project.projectmanager.domain.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
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
@Table(name="projects")
public class ProjectEntity{

 	  // @Id
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "project_id_seq)



    @Id
	private Long project_id;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    TeamsEntity fkTeamID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private MemberEntity fkCreatorID;


    private String Name;
    private String Description;
    private LocalDateTime StartDate;
    private LocalDateTime DueDate;
    private Boolean isCompleted;


}