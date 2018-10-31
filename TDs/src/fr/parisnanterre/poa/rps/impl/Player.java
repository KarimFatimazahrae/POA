package fr.parisnanterre.poa.rps.impl;

import fr.parisnanterre.poa.rps.api.RPSEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static fr.parisnanterre.poa.rps.api.RPSEnum.PAPER;
import static fr.parisnanterre.poa.rps.api.RPSEnum.ROCK;
import static fr.parisnanterre.poa.rps.api.RPSEnum.SCISSORS;

public class Player {

    private String nom;
    private int score;
    private List<RPSEnum> listeMouv;
    private RPSEnum mouv;
    private int x;


    public Player(String nom, List<RPSEnum> listeMouv) {
        this.nom = nom;
        this.listeMouv = listeMouv;
    }

    public Player(String nom) {
        this.nom = nom;
        this.listeMouv = new ArrayList<RPSEnum>();
        Random rand = new Random();
        x=rand.nextInt(3-0);

        if(x==0){
            mouv=ROCK;
        }else if(x==1){
            mouv=PAPER;
        }else{
            mouv=SCISSORS;
        }
        listeMouv.add(mouv);
    }

    public String getNom() {

        return nom;
    }

    public int getScore() {

        return score;
    }


    public void setScore(int score) {

        this.score = score;
    }

}
