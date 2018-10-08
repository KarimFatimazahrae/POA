package fr.parisnanterre.poa.universite.implem;

import java.util.Date;

public class Professeur extends EnseignantPermanant {

    public Professeur(String nom, String prenom, String numero, double salaire, Date date, String domaineRecherche) {
        super(nom, prenom, numero, salaire, date, domaineRecherche);
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "salaire=" + salaire +
                ", date=" + date +
                '}';
    }
}
