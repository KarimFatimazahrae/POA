package fr.parisnanterre.poa.universite;

import fr.parisnanterre.poa.universite.implem.Etudiant;
import fr.parisnanterre.poa.universite.implem.Personnel;

public class Main {
     public static void main(String[] args){

         Personnel p= new Etudiant("fati","karim","toto",457) ;
         System.out.println(p);
     }
}
