package com.project.projectmanager.domain;


import com.project.projectmanager.domain.TeamMember;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="teams")
public class Teams{


 //	@Id
//	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "team_id_seq)
	private Long id;
    	
//		@ManyToOne(cascade = CascadeType.ALL)
  // 	@JoinColumn(name = "team_member_id)
    	TeamMember fkTeamLeaderID;
   	
	private String Name;
   	
	private String  Description;


}
