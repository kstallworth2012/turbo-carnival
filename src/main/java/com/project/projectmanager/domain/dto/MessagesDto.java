package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessagesDto{


		private Long id;
	
    	// MemberEntity fkMessageToMemberID;
	

   		private MemberEntity fkMessageFromMemberID;
    	
		private LocalDateTime MessageDate;
    		
		private String MessageSubject;
    		
		private String MessageText; 
    		
		private Boolean MessageRead;

}