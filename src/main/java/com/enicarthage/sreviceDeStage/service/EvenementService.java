package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.exception.EvenementNotFoundException;
import com.enicarthage.sreviceDeStage.model.Evenement;
import com.enicarthage.sreviceDeStage.repository.EvenementRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor

public class EvenementService {
    private final EvenementRepo evenementRepo;

    public Evenement addEvenement(Evenement evenement) {
        return evenementRepo.save(evenement);
    }

    public Evenement updateEvenement(Evenement evenement) {
        return evenementRepo.save(evenement);
    }

    public List<Evenement> findAllEvenements() {
        return evenementRepo.findAll();
    }

    public Evenement findEvenementById(Long id) {
        return evenementRepo.findById(id)
                .orElseThrow(() -> new EvenementNotFoundException("Evenement with id " + id + " not found"));
    }

    public void deleteEvenement(Long id) {
        evenementRepo.deleteById(id);
    }
}
