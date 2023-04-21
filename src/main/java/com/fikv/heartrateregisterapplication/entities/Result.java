package com.fikv.heartrateregisterapplication.entities;

import jakarta.persistence.*;
import lombok.*;

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
    private User user;
    @ManyToOne
    private Notification notification;
    private Long systolic;//skurczowe
    private Long diastolic;//rozkurczowe
    private Date dateOfMeasurement;




}
