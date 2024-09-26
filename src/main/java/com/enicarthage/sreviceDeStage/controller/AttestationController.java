package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.model.Attestation;
import com.enicarthage.sreviceDeStage.service.AttestationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/attestations")
@RequiredArgsConstructor
public class AttestationController {

    private final AttestationService attestationService;

    @GetMapping("/{id}")
    public Optional<Attestation> getAttestationById(@PathVariable Long id) {
        return attestationService.getAttestationById(id);
    }

    @PostMapping("/create")
    public Attestation createAttestation(@RequestBody Attestation attestation) {
        return attestationService.createAttestation(attestation);
    }

    @PutMapping("/{id}")
    public Attestation updateAttestation(@PathVariable Long id, @RequestBody Attestation attestation) {
        return attestationService.updateAttestation(id, attestation);
    }

    @DeleteMapping("/{id}")
    public void deleteAttestation(@PathVariable Long id) {
        attestationService.deleteAttestation(id);
    }

    @GetMapping("/all")
    public List<Attestation> getAllAttestations() {
        return attestationService.getAllAttestations();
    }
}

