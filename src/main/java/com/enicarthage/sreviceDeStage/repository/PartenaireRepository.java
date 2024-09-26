package com.enicarthage.sreviceDeStage.repository;

import com.enicarthage.sreviceDeStage.model.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {

}

