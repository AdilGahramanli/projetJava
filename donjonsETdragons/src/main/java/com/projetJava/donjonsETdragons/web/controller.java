package com.projetJava.donjonsETdragons.web;

import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.lang.Math.random;

@RestController
public class controller extends service{
    private ArrayList<Personnage> listeDePersonnages = new ArrayList<Personnage>();

    public controller(ArrayList<Personnage> listeDePersonnages) {
        this.listeDePersonnages.add(new Personnage(1, "sdfsd", "mage", 5));
        this.listeDePersonnages.add(new Personnage(2, "sdfsd", "mage", 5));
        this.listeDePersonnages.add(new Personnage(3, "sdfsd", "mage", 5));
        this.listeDePersonnages.add(new Personnage(4, "sdfsd", "mage", 5));
        this.listeDePersonnages.add(new Personnage(5, "sdfsd", "mage", 5));
    }

    //    @GetMapping("/")
//
//        public Personnage listePersonnages() {
//            ArrayList<Personnage> listePersonnages = new ArrayList<Personnage>();
//            for (int i=0; i< listePersonnages.size(); i++) {
//                listePersonnages.add(new Personnage(i, "name"+i, "Magicien", 5));
//            }
//            Personnage personnage = new Personnage(1, "Bloublou", "Magicien", 5);
//            return personnage;
//        }
//
//        @GetMapping("/liste")
//        public

    //
    @RequestMapping(value = "/liste", method = RequestMethod.GET)
    public List getPersonnageListe() {
        return listeDePersonnages;
    }

    @GetMapping("/personnage/{id}")
    public Personnage getPersonnageId(@PathVariable int id) {
        return listeDePersonnages.get(id);
    }

    @PostMapping("/personnage")
    public void createPerso(@RequestBody Personnage personnage) {

        listeDePersonnages.add(personnage);
    }


    @DeleteMapping("personnage/{id}")
    public void delete(@PathVariable int id) {
        listeDePersonnages.remove(id);
    }

    @PutMapping ("personnage/{id}")
    public void update(@PathVariable int id, @RequestBody Personnage personnage) {
        listeDePersonnages.set(id, personnage);
    }



}




