package fr.parisnanterre.poa.universite.implem;

import java.util.Date;

public class Biatoss extends Personnel {

    protected  double salaire;
    protected Date dateEmbauce;
    protected Date  dateFinContrat;

    public Biatoss(String nom, String prenom, String numero, double salaire, Date dateEmbauce, Date dateFinContrat) {
        super(nom, prenom, numero);
        this.salaire = salaire;
        this.dateEmbauce = dateEmbauce;
        this.dateFinContrat = dateFinContrat;
    }
}
