package com.fikv.heartrateregisterapplication.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class AppUserDTO {
    @NotNull
    private String username;
    @NotNull
    @ToString.Exclude
    private String password;
    @NotNull
    private String emailAddress;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfRegistration;

}
