package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Rapport;
import com.enicarthage.sreviceDeStage.repository.RapportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class RapportService {

    private final RapportRepository rapportRepository;

    public Optional<Rapport> getRapportById(Long id) {
        return rapportRepository.findById(id);
    }

    public Rapport createRapport(Rapport rapport) {
        return rapportRepository.save(rapport);
    }

    public Rapport updateRapport(Long id, Rapport rapport) {
        if (rapportRepository.existsById(id)) {
            rapport.setId(id);
            return rapportRepository.save(rapport);
        }
        return null;
    }

    public void deleteRapport(Long id) {
        rapportRepository.deleteById(id);
    }
}


