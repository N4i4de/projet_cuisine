package fr.projet_cuisine.model;

import javax.persistence.*;

@Entity
public class Quantite {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private float number;

    @Enumerated(EnumType.STRING)
    private Unite unite;
    public Quantite() {
    }

    public Quantite(float number, Unite unite) {
        this.number = number;
        this.unite = unite;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }
}
