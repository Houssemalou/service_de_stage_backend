package com.enicarthage.sreviceDeStage.repository;


import com.enicarthage.sreviceDeStage.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
