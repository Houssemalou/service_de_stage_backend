package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Notification;
import com.enicarthage.sreviceDeStage.repository.NotificationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepo notificationrepo;

    public void createAndSaveNotification(String message, String recipient) {
        Notification notification = new Notification();
        notification.setText(message);
        notification.setTo(recipient);
        notification.setTimestamp(LocalDateTime.now());

        notificationrepo.save(notification);
    }
}
