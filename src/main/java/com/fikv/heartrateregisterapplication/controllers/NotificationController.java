package com.fikv.heartrateregisterapplication.controllers;

import com.fikv.heartrateregisterapplication.dtos.NotificationDTO;
import com.fikv.heartrateregisterapplication.entities.Notification;
import com.fikv.heartrateregisterapplication.serives.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping(path = "/notifications")
@Controller
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/add")
    public ResponseEntity<NotificationDTO> saveNotification(@RequestBody NotificationDTO notificationDTO) {
        return new ResponseEntity<>(notificationService.addNotification(notificationDTO), HttpStatus.CREATED);
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<Notification> getNotification(@PathVariable String username) {
        return ResponseEntity.ok(notificationService.getNotification(username));
    }
}
