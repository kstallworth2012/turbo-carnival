package com.project.projectmanager.domain;

import com.project.projectmanager.domain.Teams;
import com.project.projectmanager.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="projects")
public class Project{

 	//@Id
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "project_id_seq)
	private Long id;
    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "team_id)
    Teams fkTeamID;

    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "member_id)
    private  Member fkCreatorID;


    private String Name;
    private String Description;
    private LocalDateTime StartDate;
    private LocalDateTime DueDate;
    private Boolean isCompleted;


}