package fr.parisnanterre.poa.rps;

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
                    retour = Result.LOST;
                }
            }
        }

        return retour;
    }
}

