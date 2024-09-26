package com.enicarthage.sreviceDeStage.repository;


import com.enicarthage.sreviceDeStage.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepo extends JpaRepository<Evenement, Long> {
}
