package fr.parisnanterre.poa.universite.implem;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {

    protected Date dateFinContrat;

    public EnseignantTemporaire(String nom, String prenom,String numero, double salaire, Date date, Date dateFinContrat) {
        super(nom, prenom, numero, salaire, date);
        this.dateFinContrat = dateFinContrat;
    }

    @Override
    public String toString() {
        return "EnseignantTemporaire{" +
                "salaire=" + salaire +
                ", date=" + date +
                '}';
    }
}
