package fr.parisnanterre.poa.rps.impl;

import fr.parisnanterre.poa.rps.api.RPSEnum;
import fr.parisnanterre.poa.rps.api.Result;
import fr.parisnanterre.poa.rps.impl.Player;

import static fr.parisnanterre.poa.rps.api.Result.LOST;

public class RockPaperScissors {


    Result play(RPSEnum p1, RPSEnum p2){
        Result retour = null;

        if(p1.equals(p2)){
            retour = Result.TIE;
        }else{
            if(
                    p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.ROCK)
                            || p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.PAPER)
                            || p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.SCISSORS)
            ){
                retour = Result.WIN;
            }else{
                if(
                        p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.PAPER)
                                || p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.SCISSORS)
                                || p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.ROCK)
                ){
                    retour = LOST;
                }
            }
        }

        return retour;
    }


   /* public Result play(Player p1, Player p2){

        return LOST;
    }*/
}

