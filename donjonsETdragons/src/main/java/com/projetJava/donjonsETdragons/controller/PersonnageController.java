package com.projetJava.donjonsETdragons.controller;

import com.projetJava.donjonsETdragons.dao.PersonnageDao;
import com.projetJava.donjonsETdragons.model.Personnage;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;


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
