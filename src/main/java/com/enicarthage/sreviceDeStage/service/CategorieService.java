package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Categorie;
import com.enicarthage.sreviceDeStage.repository.CategorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategorieService {

    private final CategorieRepository categorieRepository;

    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    public Optional<Categorie> getCategorieById(Long id) {
        return categorieRepository.findById(id);
    }

    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
