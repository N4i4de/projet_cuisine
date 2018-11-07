package fr.projet_cuisine.model;

import javax.persistence.*;

@Entity
public class Rangement {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nom;

    @Enumerated(EnumType.STRING)
    private TypeRangement rangement;


}
