package com.fikv.heartrateregisterapplication.dtos;

import lombok.Data;

@Data
public class NotificationDTO {

    private String userName;
    private Integer dayOfTheWeek;
    private String hours;

}
