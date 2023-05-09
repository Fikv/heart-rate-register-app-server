package com.fikv.heartrateregisterapplication.repositories;

import com.fikv.heartrateregisterapplication.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
