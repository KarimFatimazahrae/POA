package fr.parisnanterre.poa.universite.implem;

public class Doctorant extends Etudiant {

    public Doctorant(String nom, String prenom, String numero, double bourse) {
        super(nom, prenom, numero, bourse);
    }

    @Override
    public String toString() {
        return "Doctorant{\" + super.toString()+\n" + "}";
    }
}
