package com.projetJava.donjonsETdragons.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.projetJava.donjonsETdragons.model.Personnage;
import org.springframework.data.repository.ListCrudRepository;


@EnableJpaRepositories
@SpringBootApplication

@Repository
public interface RepositoryPersonnage extends CrudRepository<Personnage, Integer>{

}
