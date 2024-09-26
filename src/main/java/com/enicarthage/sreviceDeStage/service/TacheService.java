package com.enicarthage.sreviceDeStage.service;

import com.enicarthage.sreviceDeStage.exception.TacheNotFoundException;
import com.enicarthage.sreviceDeStage.model.Tache;
import com.enicarthage.sreviceDeStage.repository.TacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TacheService {
    private  final TacheRepository tacheRepo ;

    public Tache addTache(Tache tache) {
        return(Tache)this.tacheRepo.save(tache);
    }
    public Tache updateTache(Tache tache) {
        return (Tache)this.tacheRepo.save(tache) ;
    }
    public List<Tache> findAllTaches() {
        return tacheRepo.findAll() ;
    }
    public Tache findTacheById(Long id){
        return (Tache)this.tacheRepo.findById(id).orElseThrow(() -> {
            return new TacheNotFoundException("User par id " + id + "nest pas trouve") ;
        }) ;
    };
    public void deleteTache(Long id) {
        this.tacheRepo.deleteById(id);
    }


}
