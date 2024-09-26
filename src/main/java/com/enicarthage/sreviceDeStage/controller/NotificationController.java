package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;



    @PostMapping("/sendNotification")
    public void sendNotification(@RequestBody NotificationRequest request) {
        notificationService.createAndSaveNotification(request.getMessage(), request.getRecipient());
    }

    static class NotificationRequest {
        private String message;
        private String recipient;

        // Getters and setters
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }
    }
}
