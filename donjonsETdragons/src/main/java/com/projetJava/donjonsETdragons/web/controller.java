package com.projetJava.donjonsETdragons.web;

import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controller {

    @GetMapping("/")

        public Personnage listePersonnages() {
            ArrayList<Personnage> listePersonnages = new ArrayList<Personnage>();
            for (int i=0; i< listePersonnages.size(); i++) {
                listePersonnages.add(new Personnage(i, "name"+i, "Magicien", 5));
            }
            Personnage personnage = new Personnage(1, "Bloublou", "Magicien", 5);
            return personnage;
        }

        @GetMapping("/liste")
        public 
    }



