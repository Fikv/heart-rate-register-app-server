package com.fikv.heartrateregisterapplication.serives;

import com.fikv.heartrateregisterapplication.dtos.AppUserDTO;
import com.fikv.heartrateregisterapplication.dtos.LoginAppUserDTO;
import com.fikv.heartrateregisterapplication.entities.AppUser;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserService {

    private final UserRepository userRepository;

    public void createUser(AppUserDTO appUserDTO){
        userRepository.save(new AppUser(appUserDTO.getUsername(),
                appUserDTO.getPassword(),
                appUserDTO.getEmailAddress(),
                appUserDTO.getDateOfRegistration()));
    }

    public boolean login(LoginAppUserDTO loginAppUserDTO) {
        AppUser appUser = userRepository.findByUsername(loginAppUserDTO.getLogin());
        return appUser != null && appUser.getPassword().equals(loginAppUserDTO.getPassword());
    }

}
