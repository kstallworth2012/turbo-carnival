package com.project.projectmanager.domain;


import com.project.projectmanager.domain.Task;
import com.project.projectmanager.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Entity
// @Table(name="timecards")
public class TimeCard{


 	// @Id
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