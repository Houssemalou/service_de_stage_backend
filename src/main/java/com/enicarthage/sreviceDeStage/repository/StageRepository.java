package com.enicarthage.sreviceDeStage.repository;

import com.enicarthage.sreviceDeStage.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {

}


