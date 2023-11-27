package com.projetJava.donjonsETdragons.web;
import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    List personnages = new ArrayList<Personnage>();
    Personnage personnage;


    public Personnage findById(int id) {
        Personnage personnage = new Personnage(id, "NomPerso", "Mage", 25);
        return personnage;
    }

//    public void personnageNameRandom() {
//
//       List<String> listLetters = Arrays.asList(new String[]{"a", "b", "c", "d","e","f","g","i","k","l","m","n","o","p","s"});
//       random.Maths
//    }
//}
    public List findAll() {

        for(int i=0; i<5; i++ ) {
        personnages.add(i, findById(i));}
        return personnages;
    }

    public void addNewPerso (Personnage personnage) {
        personnages.addLast(personnage);
    }

//    public User add(User user) {
//        users.add(user);
//        return user;
//    }



}
