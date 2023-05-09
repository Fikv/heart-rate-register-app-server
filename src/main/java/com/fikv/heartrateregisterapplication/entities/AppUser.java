package com.fikv.heartrateregisterapplication.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Builder
@Entity(name = "APP_USERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String emailAddress;
    private Date dateOfCreationAccount;

    public AppUser(String username, String password, String emailAddress, Date dateOfCreationAccount) {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.dateOfCreationAccount = dateOfCreationAccount;
    }
}
