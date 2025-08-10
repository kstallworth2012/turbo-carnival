package com.project.projectmanager.domain;

import com.project.projectmanager.domain.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

import java.time.LocalDateTime;import jakarta.persistence.OneToOne;
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
@Table(name="tasks")
public class TaskEntity{

 	   @Id
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "task_id_seq)
	   private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
     private ProjectEntity fkProjectID;
     private String Name;
     private String Description;
     private LocalDateTime DueDate;
     private Double Budget;
     private Double DefaultHourlyRate;
     private Boolean isCompleted;

}