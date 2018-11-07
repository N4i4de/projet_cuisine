package fr.projet_cuisine.model;

import javax.persistence.*;

@Entity
public class Ingredient {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Aliment aliment;
    @OneToOne
    private Quantite quantite;

    public Aliment getAliment() {
        return aliment;
    }

    public void setAliment(Aliment aliment) {
        this.aliment = aliment;
    }


    public Ingredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
