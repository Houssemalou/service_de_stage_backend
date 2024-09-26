package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Attestation;
import com.enicarthage.sreviceDeStage.repository.AttestationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AttestationService {


    private final AttestationRepository attestationRepository;

    public Optional<Attestation> getAttestationById(Long id) {
        return attestationRepository.findById(id);
    }

    public Attestation createAttestation(Attestation attestation) {
        return attestationRepository.save(attestation);
    }

    public Attestation updateAttestation(Long id, Attestation attestation) {
        if (attestationRepository.existsById(id)) {
            attestation.setId(id);
            return attestationRepository.save(attestation);
        }
        return null;
    }

    public void deleteAttestation(Long id) {
        attestationRepository.deleteById(id);
    }

    public List<Attestation> getAllAttestations() {
        return attestationRepository.findAll();
    }
}

