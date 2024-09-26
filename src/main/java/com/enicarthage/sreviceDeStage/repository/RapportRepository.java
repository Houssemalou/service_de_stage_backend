package com.enicarthage.sreviceDeStage.repository;

import com.enicarthage.sreviceDeStage.model.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long> {

}

