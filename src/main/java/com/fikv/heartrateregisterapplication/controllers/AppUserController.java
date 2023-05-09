package com.fikv.heartrateregisterapplication.controllers;

import com.fikv.heartrateregisterapplication.dtos.AppUserDTO;
import com.fikv.heartrateregisterapplication.dtos.LoginAppUserDTO;
import com.fikv.heartrateregisterapplication.serives.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @PostMapping(path = "/register")
    public ResponseEntity<String> createUser(@RequestBody AppUserDTO appUserDTO) {
        appUserService.createUser(appUserDTO);
        return ResponseEntity.ok("User has been created");
    }

    @PostMapping(path = "/login")
    public ResponseEntity<Boolean> createUser(@RequestBody LoginAppUserDTO loginAppUserDTO) {
        return appUserService.login(loginAppUserDTO) ? ResponseEntity.ok(true)
                : ResponseEntity.badRequest().body(false);
    }

}
