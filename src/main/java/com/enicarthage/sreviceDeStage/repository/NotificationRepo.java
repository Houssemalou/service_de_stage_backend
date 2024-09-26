package com.enicarthage.sreviceDeStage.repository;


import com.enicarthage.sreviceDeStage.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {
}
