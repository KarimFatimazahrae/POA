package fr.parisnanterre.poa.universite.implem;

import java.util.Date;

public  abstract class EnseignantPermanant extends Enseignant {
    protected String domaineRecherche;

    public EnseignantPermanant(String nom, String prenom, String numero, double salaire, Date date, String domaineRecherche) {
        super(nom, prenom, numero, salaire, date);
        this.domaineRecherche = domaineRecherche;
    }

    public String getDomaineRecherche() {
        return domaineRecherche;
    }

    @Override
    public String toString() {
        return "EnseignantPermanant{" +
                "domaineRecherche='" + domaineRecherche + '\'' +
                '}';
    }
}
