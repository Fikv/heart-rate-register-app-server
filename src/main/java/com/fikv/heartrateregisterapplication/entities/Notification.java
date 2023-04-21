package com.fikv.heartrateregisterapplication.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "NOTIFICATION")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User user;
    private String dayOfTheWeek;
    private String hours;


}
