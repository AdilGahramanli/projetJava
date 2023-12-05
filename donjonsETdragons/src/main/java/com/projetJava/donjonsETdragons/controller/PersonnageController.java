package com.projetJava.donjonsETdragons.controller;

import com.projetJava.donjonsETdragons.dao.PersonnageDao;
import com.projetJava.donjonsETdragons.model.Personnage;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController


public class PersonnageController {

    RestTemplate restTemplate = new RestTemplate();

//    ResponseEntity<? extends PersonnageController> personnage = new RestTemplate().getForEntity("https://random-word-api.herokuapp.com/word", getClass(), Personnage.class);

    private final PersonnageDao personnageDao;


    public PersonnageController (PersonnageDao personnageDao) {
        this.personnageDao = personnageDao;
    }



    @GetMapping("/Personnages")
    public List<Personnage> personnages() {
        return personnageDao.findAll();
    }

    @GetMapping("/Personnages/{id}")
    public Optional<Personnage> afficherUnPersonnage(@PathVariable int id) {
        return personnageDao.findById(id);
    }


    @PutMapping("/Personnages/{id}")
    public void modifierUnPersonnage(Personnage nouveauPersonnage) {
        changePersonnageName(nouveauPersonnage);
         personnageDao.save(nouveauPersonnage);
    }

    @PostMapping("/Personnage")
    public void ajouterPersonnage(Personnage personnage) {
         personnageDao.save(personnage);
    }

    @DeleteMapping("Personnages/{id}")
    public void effacerPersonnage(@PathVariable int id) {
         personnageDao.deleteById(id);
    }

    public Personnage changePersonnageName(Personnage personnage) {
        List<String> response = restTemplate.getForObject("https://random-word-api.herokuapp.com/word", List.class);
        String responseFinal = response.getFirst();
        personnage.setName(responseFinal);
        return personnage;
    }
}
