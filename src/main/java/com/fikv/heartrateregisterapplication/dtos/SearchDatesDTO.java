package com.fikv.heartrateregisterapplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchDatesDTO {
    private String userName;
    private Date startDate;
    private Date endDate;

}
