package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.exception.MessageNotFoundException;
import com.enicarthage.sreviceDeStage.model.Message;
import com.enicarthage.sreviceDeStage.repository.MessageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepo messageRepo;


    public Message addMessage(Message message) {
        return messageRepo.save(message);
    }

    public Message updateMessage(Message message) {
        return messageRepo.save(message);
    }

    public List<Message> findAllMessages() {
        return messageRepo.findAll();
    }

    public Message findMessageById(Long id) {
        return messageRepo.findById(id)
                .orElseThrow(() -> new MessageNotFoundException("Message with id " + id + " not found"));
    }

    public void deleteMessage(Long id) {
        messageRepo.deleteById(id);
    }
}
