package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.model.Rapport;
import com.enicarthage.sreviceDeStage.service.RapportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/rapports")
@RequiredArgsConstructor
public class RapportController {


    private final RapportService rapportService;

    @GetMapping("/{id}")
    public Optional<Rapport> getRapportById(@PathVariable Long id) {
        return rapportService.getRapportById(id);
    }
    @PostMapping("/create")
    public Rapport createRapport(@RequestBody Rapport rapport) {
        return rapportService.createRapport(rapport);
    }
    @PutMapping("/{id}")
    public Rapport updateRapport(@PathVariable Long id, @RequestBody Rapport rapport) {
        return rapportService.updateRapport(id, rapport);
    }
    @DeleteMapping("/{id}")
    public void deleteRapport(@PathVariable Long id) {
        rapportService.deleteRapport(id);
    }
}

