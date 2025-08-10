package com.project.projectmanager.domain;


import com.project.projectmanager.domain.Task;
import com.project.projectmanager.domain.Member;
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
@Table(name="timecards")
public class TimeCardEntity{


 	@Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= time_card"_id_seq)
	private Long id;

    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "task_id")
    //fkTaskID;
    
    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "member_id")
    //fkMemberID;

    LocalDateTime TimeCardDate;
    private String WorkDescription;
    private Integer HourCount;
    private Float HourlyRate;
    private Boolean IsBilled;

}