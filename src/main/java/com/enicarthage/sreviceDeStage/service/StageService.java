package com.enicarthage.sreviceDeStage.service;


import com.enicarthage.sreviceDeStage.model.Stage;
import com.enicarthage.sreviceDeStage.repository.StageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StageService {


    private final StageRepository stageRepository;

    public Stage getStageById(Long id) {
        return stageRepository.findById(id).orElse(null);
    }

    public Stage createStage(Stage stage) {
        return stageRepository.save(stage);
    }

    public Stage updateStage(Long id, Stage stage) {
        if (stageRepository.existsById(id)) {
            stage.setId(id);
            return stageRepository.save(stage);
        }
        return null;
    }

    public void deleteStage(Long id) {
        stageRepository.deleteById(id);
    }

    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }
}
