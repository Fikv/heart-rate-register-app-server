package com.fikv.heartrateregisterapplication.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LoginAppUserDTO {
    @NotNull
    private String login;
    @NotNull
    private String password;
}
