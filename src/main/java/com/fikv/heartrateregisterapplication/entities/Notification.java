package com.fikv.heartrateregisterapplication.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "NOTIFICATION")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private AppUser user;
    private String dayOfTheWeek;
    private String hours;

    public Notification(AppUser user, String dayOfTheWeek, String hours) {
        this.user = user;
        this.dayOfTheWeek = dayOfTheWeek;
        this.hours = hours;
    }

}
