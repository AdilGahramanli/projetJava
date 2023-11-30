package com.projetJava.donjonsETdragons.dao;

import com.projetJava.donjonsETdragons.model.Personnage;

import java.util.List;

public interface PersonnageDao {

    List<Personnage> findAll();
    Personnage findById(int id);

    Personnage save(Personnage personnage);

    void delete(int id);


}
