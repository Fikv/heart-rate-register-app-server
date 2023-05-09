package com.fikv.heartrateregisterapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "RESULT")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private AppUser user;
    @ManyToOne
    private Notification notification;
    private Long systolic;//skurczowe
    private Long diastolic;//rozkurczowe
    private Long heartRate;
    private Date dateOfMeasurement;




}
