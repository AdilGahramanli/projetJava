package com.projetJava.donjonsETdragons.dao;

import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface donjonsDragonsDAO {
    ArrayList<Personnage> findAll();
    Personnage findById(int id);
    Personnage save(Personnage personnage);

    ArrayList<Personnage> delete(int id);
}
