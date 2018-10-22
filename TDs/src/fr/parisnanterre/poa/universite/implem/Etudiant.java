package fr.parisnanterre.poa.universite.implem;

public class Etudiant extends Personnel {

    private double bourse;

    public Etudiant(String nom, String prenom, String numero, double bourse) {
        super(nom, prenom, numero);
        this.bourse = bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString()+
                "bourse=" + bourse +
                '}';
    }
}
