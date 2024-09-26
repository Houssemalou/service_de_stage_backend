package com.enicarthage.sreviceDeStage.repository;

import com.enicarthage.sreviceDeStage.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TacheRepository extends JpaRepository<Tache, Long> {

}

