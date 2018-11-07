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

    private int dureeConservation;

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

    public int getDureeConservation() {
        return dureeConservation;
    }

    public void setDureeConservation(int dureeConservation) {
        this.dureeConservation = dureeConservation;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", dureeConservation=" + dureeConservation +
                '}';
    }
}
