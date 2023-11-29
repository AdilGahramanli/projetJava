package com.projetJava.donjonsETdragons.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.GeneratedValue;


@Entity
public class Personnage {


    @Id
    int id;
    private String name;
    private String type;
    private int life;
    public Personnage(int id, String name, String type, int life) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.life = life;
    }

    public Personnage() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLife() {
        return life;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", life=" + life +
                '}';
    }
}
