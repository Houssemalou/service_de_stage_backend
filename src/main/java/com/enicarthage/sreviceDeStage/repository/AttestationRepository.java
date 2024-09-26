package com.enicarthage.sreviceDeStage.repository;


import com.enicarthage.sreviceDeStage.model.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttestationRepository extends JpaRepository<Attestation, Long> {
    Attestation findById(long id);
}

