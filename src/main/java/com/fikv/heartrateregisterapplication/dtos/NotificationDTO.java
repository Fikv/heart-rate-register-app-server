package com.fikv.heartrateregisterapplication.dtos;

import lombok.Data;

@Data
public class NotificationDTO {

    private Long userId;
    private Integer dayOfTheWeek;
    private String hours;

}
