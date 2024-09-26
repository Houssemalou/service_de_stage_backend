package com.enicarthage.sreviceDeStage.controller;


import com.enicarthage.sreviceDeStage.model.Stage;
import com.enicarthage.sreviceDeStage.service.StageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/stages")
@RequiredArgsConstructor
public class StageController {

    private final StageService stageService;

    @GetMapping("/{id}")
    public Stage getStageById(@PathVariable Long id) {
        return stageService.getStageById(id);
    }

    @PostMapping("/create")
    public Stage createStage(@RequestBody Stage stage) {
        return stageService.createStage(stage);
    }

    @PutMapping("/{id}")
    public Stage updateStage(@PathVariable Long id, @RequestBody Stage stage) {
        return stageService.updateStage(id, stage);
    }

    @DeleteMapping("/{id}")
    public void deleteStage(@PathVariable Long id) {
        stageService.deleteStage(id);
    }

    @GetMapping("/all")
    public List<Stage> getAllStages() {
        return stageService.getAllStages();
    }
}
