package com.project.projectmanager.domain.dto;


import com.project.projectmanager.domain.TaskEntity;
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
public class TimeCardDto{



	private Long id;
    private TaskEntity fkTaskID;
    private MemberEntity fkMemberID;
    private LocalDateTime TimeCardDate;
    private String WorkDescription;
    private Integer HourCount;
    private Float HourlyRate;
    private Boolean IsBilled;
}