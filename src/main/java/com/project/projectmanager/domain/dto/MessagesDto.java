package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.MemberEntitys;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessagesDto{


		private Long id;
	
    	// MemberEntity fkMessageToMemberID;
	

   		private MemberEntitys fkMessageFromMemberID;
    	
		private LocalDateTime MessageDate;
    		
		private String MessageSubject;
    		
		private String MessageText; 
    		
		private Boolean MessageRead;

}