package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDto{




     	  
	 private Long id;
     private ProjectEntity fkProjectID;
     private String Name;
     private String Description;
     private LocalDateTime DueDate;
     private Double Budget;
     private Double DefaultHourlyRate;
     private Boolean isCompleted;


}