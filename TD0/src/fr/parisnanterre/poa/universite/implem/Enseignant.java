package fr.parisnanterre.poa.universite.implem;

import java.util.Date;

public abstract class Enseignant extends Personnel {

    protected double salaire;
    protected Date date;

    public Enseignant(String nom, String prenom, String numero, double salaire, Date date) {
        super(nom, prenom, numero);
        this.salaire = salaire;
        this.date = date;
    }
}
