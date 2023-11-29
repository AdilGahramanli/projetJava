package com.projetJava.donjonsETdragons.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.data.repository.ListCrudRepository;

@Repository
public interface RepositoryPersonnage extends CrudRepository<Personnage, Integer>{

}
