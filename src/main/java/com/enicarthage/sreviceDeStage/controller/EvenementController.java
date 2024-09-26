package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.model.Evenement;
import com.enicarthage.sreviceDeStage.service.EvenementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/evenements")
@RequiredArgsConstructor
public class EvenementController {
    private final EvenementService evenementService;


    @GetMapping("/all")
    public ResponseEntity<List<Evenement>> getAllEvenements() {
        List<Evenement> evenements = evenementService.findAllEvenements();
        return new ResponseEntity<>(evenements, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Evenement> getEvenementById(@PathVariable("id") Long id) {
        Evenement evenement = evenementService.findEvenementById(id);
        return new ResponseEntity<>(evenement, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Evenement> addEvenement(@RequestBody Evenement evenement) {
        Evenement newEvenement = evenementService.addEvenement(evenement);
        return new ResponseEntity<>(newEvenement, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Evenement> updateEvenement(@RequestBody Evenement evenement) {
        Evenement updatedEvenement = evenementService.updateEvenement(evenement);
        return new ResponseEntity<>(updatedEvenement, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvenement(@PathVariable("id") Long id) {
        evenementService.deleteEvenement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
