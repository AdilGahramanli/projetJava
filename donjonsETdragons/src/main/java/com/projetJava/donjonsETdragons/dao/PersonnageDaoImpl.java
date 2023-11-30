package com.projetJava.donjonsETdragons.dao;

import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonnageDaoImpl implements PersonnageDao {
    public static List<Personnage> personnages = new ArrayList<>();

    static {
        personnages.add(new Personnage(1,"perso1exemple","magicien", 2));
        personnages.add(new Personnage(2, "perso2exemple", "guerrier", 5));
    }

    @Override
    public List<Personnage> findAll() {
        return personnages;
    }

    @Override
    public Personnage findById(int id) {
        for (Personnage personnage : personnages) {
            if (personnage.getId()==id) {
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage save(Personnage personnage) {
        personnages.add(personnage);
        return personnage;
    }

    @Override
    public void delete(int id) {
        for(Personnage personnage : personnages) {
            if (personnage.getId()==id) {
                personnages.remove(id);
            }
        }

    }
}
