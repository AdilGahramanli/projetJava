package com.projetJava.donjonsETdragons.controller;

import com.projetJava.donjonsETdragons.dao.PersonnageDao;
import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonnageController {

    private final PersonnageDao personnageDao;

    public PersonnageController (PersonnageDao personnageDao) {
        this.personnageDao = personnageDao;
    }

    @GetMapping("/Personnages")
    public List<Personnage> personnages() {
        return personnageDao.findAll();
    }

    @GetMapping("/Personnages/{id}")
    public Personnage afficherUnPersonnage(@PathVariable int id) {
        return personnageDao.findById(id);
    }

    @PostMapping("/Personnages/{id}")
    public Personnage ajouterUnPersonnage(Personnage nouveauPersonnage) {
        return personnageDao.save(nouveauPersonnage);
    }

    @DeleteMapping("Personnages/{id}")
    public void effacerPersonnage(@PathVariable int id) {
         personnageDao.delete(id);
    }
}
