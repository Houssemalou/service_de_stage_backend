package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Partenaire;
import com.enicarthage.sreviceDeStage.repository.PartenaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PartenaireService {
    private final PartenaireRepository partenaireRepository;

    public Partenaire savePartenaire(Partenaire partenaire) {
        return partenaireRepository.save(partenaire);
    }
    public List<Partenaire> getAllPartenaires() {
        return partenaireRepository.findAll();
    }
    public Optional<Partenaire> getPartenaireById(Long id) {
        return partenaireRepository.findById(id);
    }
    public void deletePartenaire(Long id) {
        partenaireRepository.deleteById(id);
    }
}

