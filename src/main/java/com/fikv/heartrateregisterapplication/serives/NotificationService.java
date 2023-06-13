package com.fikv.heartrateregisterapplication.serives;

import com.fikv.heartrateregisterapplication.dtos.NotificationDTO;
import com.fikv.heartrateregisterapplication.entities.Notification;
import com.fikv.heartrateregisterapplication.repositories.NotificationRepository;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import com.fikv.heartrateregisterapplication.util.DayOfWeek;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final UserRepository userRepository;
    private final NotificationRepository notificationRepository;

    public NotificationDTO addNotification(@RequestBody NotificationDTO notificationDTO) {
        notificationRepository.save(new Notification(userRepository.findByUsername(notificationDTO.getUserName())
        ,DayOfWeek.getValueOf(notificationDTO.getDayOfTheWeek()).toString(), notificationDTO.getHours()));
        return notificationDTO;
    }

    public Notification getNotification(String username){
        List<Notification> list = notificationRepository.findAll();
       return notificationRepository.findAll().stream().filter(e -> e.getUser().getUsername().equals(username)).findFirst().get();
    }


}
