package com.project.projectmanager.domain;




import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import com.project.projectmanager.domain.Member;
import com.project.projectmanager.domain.Teams;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="posts")
public  class PostsEntity{

 			@Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "post_id_seq)
			private Long id;
  	
		@ManyToOne(cascade = CascadeType.ALL)
    	@JoinColumn(name = "member_id")
    	MemberEntity fkAuthorID;
  
		@ManyToOne(cascade = CascadeType.ALL)
    	@JoinColumn(name = "team_id")
    	TeamsEntity fkTeamID;
  	
	// @ManyToOne(cascade = CascadeType.ALL)
    // 	@JoinColumn(name = "post_id")
    	private Long fkOriginalPostId;

    	private LocalDateTime PostDate;
    	private String Subject;
    	private String PostMessageText;

}