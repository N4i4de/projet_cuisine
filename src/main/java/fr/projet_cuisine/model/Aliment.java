package fr.projet_cuisine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aliment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;

    private String name;

    private int duree;

    public Aliment(String name) {
        this.name = name;
    }

    public Aliment(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
