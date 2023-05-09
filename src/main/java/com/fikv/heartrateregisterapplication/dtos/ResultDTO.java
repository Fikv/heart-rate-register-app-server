package com.fikv.heartrateregisterapplication.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

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
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateOfMeasurement;
}
