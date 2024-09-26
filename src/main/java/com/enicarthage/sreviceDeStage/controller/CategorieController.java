package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.model.Categorie;
import com.enicarthage.sreviceDeStage.service.CategorieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {


    private final CategorieService categorieService;

    @GetMapping("/")
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Categorie> getCategorieById(@PathVariable Long id) {
        return categorieService.getCategorieById(id);
    }

    @PostMapping("/")
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }

    @PutMapping("/{id}")
    public Categorie updateCategorie(@PathVariable Long id, @RequestBody Categorie categorie) {
        // Assurez-vous que l'ID dans le corps de la requête correspond à l'ID dans l'URL
        categorie.setId(id);
        return categorieService.saveCategorie(categorie);
    }

    @DeleteMapping("/{id}")
    public void deleteCategorie(@PathVariable Long id) {
        categorieService.deleteCategorie(id);
    }
}
