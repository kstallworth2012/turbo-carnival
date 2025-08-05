package com.project.projectmanager.domain;

// import com.project.projectmanager.domain.Project;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import java.time.LocalDateTime;
import java.time.LocalDateTime;
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Entity
// @Table(name="tasks")
public class TaskEntity{

 	//@Id
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "task_id_seq)
	private Long id;
  //  Project fkProjectID;
    private String Name;
    private String Description;
    private LocalDateTime DueDate;
    private Double Budget;
    private Double DefaultHourlyRate;
    private Boolean isCompleted;

}