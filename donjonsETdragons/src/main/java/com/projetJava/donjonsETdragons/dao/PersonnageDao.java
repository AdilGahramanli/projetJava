package com.projetJava.donjonsETdragons.dao;

import com.projetJava.donjonsETdragons.model.Personnage;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnageDao extends JpaRepository<Personnage, Integer> {

//    List<Personnage> findAll();
//    Personnage findById(int id);

//    Personnage save(Personnage personnage);

//    void delete(int id);


}
