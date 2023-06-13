package com.fikv.heartrateregisterapplication.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ResultDTO {
    @NotNull
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private Long notificationId;
    @NotNull
    private Long systolic;
    @NotNull
    private Long diastolic;
    @NotNull
    private Long heartRate;
    private LocalDate dateOfMeasurement;
}
