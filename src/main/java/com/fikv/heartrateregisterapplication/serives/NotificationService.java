package com.fikv.heartrateregisterapplication.serives;

import com.fikv.heartrateregisterapplication.dtos.NotificationDTO;
import com.fikv.heartrateregisterapplication.entities.Notification;
import com.fikv.heartrateregisterapplication.repositories.NotificationRepository;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import com.fikv.heartrateregisterapplication.util.DayOfWeek;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final UserRepository userRepository;
    private final NotificationRepository notificationRepository;

    public NotificationDTO addNotification(@RequestBody NotificationDTO notificationDTO) {
        notificationRepository.save(new Notification(userRepository.findById(notificationDTO.getUserId()).get()
        ,DayOfWeek.getValueOf(notificationDTO.getDayOfTheWeek()).toString(), notificationDTO.getHours()));
        return notificationDTO;
    }


}
