package com.project.projectmanager.domain;


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
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="messages")
public class MessagesEntity{
	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "message_id_seq)
	    @Id
		private Long id;
	
		// @ManyToOne(cascade = CascadeType.ALL)
    	// @JoinColumn(name = "member_id")
    	// MemberEntity fkMessageToMemberID;
	
		@ManyToOne(cascade = CascadeType.ALL)
    	@JoinColumn(name = "member_id")
   		MemberEntity fkMessageFromMemberID;
    	
		private LocalDateTime MessageDate;
    		
		private String MessageSubject;
    		
		private String MessageText; 
    		
		private Boolean MessageRead;

} 