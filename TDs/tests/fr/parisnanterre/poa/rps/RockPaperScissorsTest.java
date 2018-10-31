package fr.parisnanterre.poa.rps;

import fr.parisnanterre.poa.rps.api.RPSEnum;
import fr.parisnanterre.poa.rps.api.Result;
import fr.parisnanterre.poa.rps.impl.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception{
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps= null;
    }
/*
    @Test
    public void testPlay1() {
        assertEquals(WIN,rps.play(RPSEnum.ROCK,RPSEnum.PAPER));
    }

    @Test
    public void testPlay2() {
        assertEquals(LOST,rps.play(RPSEnum.ROCK,RPSEnum.PAPER));
    } */


    @DataProvider(name = "data")
    public Object [][] dataProvider() {
        return new Object[][] {

                {RPSEnum.PAPER,RPSEnum.SCISSORS, Result.LOST},
                {RPSEnum.PAPER,RPSEnum.ROCK, Result.WIN},
                {RPSEnum.PAPER,RPSEnum.PAPER, Result.TIE},
                {RPSEnum.SCISSORS,RPSEnum.ROCK, Result.LOST},
                {RPSEnum.SCISSORS,RPSEnum.PAPER, Result.WIN},
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS, Result.TIE},
                {RPSEnum.ROCK,RPSEnum.SCISSORS, Result.WIN},
                {RPSEnum.ROCK,RPSEnum.PAPER, Result.LOST},
                {RPSEnum.ROCK,RPSEnum.ROCK, Result.TIE},

        } ;
    }

/*
    //@Parameters({"paper","rock"})
    @DataProvider(name = "winData")
    public Object [][] winDataProvider() {
        return new Object[][] {

                {RPSEnum.PAPER,RPSEnum.SCISSORS, WIN},
                {RPSEnum.SCISSORS,RPSEnum.ROCK, WIN},
                {RPSEnum.ROCK,RPSEnum.SCISSORS, WIN},


        } ;
    }

    @DataProvider(name = "lostData")
    public Object [][] lostDataProvider() {
        return new Object[][] {
                {RPSEnum.PAPER,RPSEnum.ROCK, LOST},
                {RPSEnum.SCISSORS,RPSEnum.PAPER, LOST},
                {RPSEnum.ROCK,RPSEnum.PAPER, LOST},
        } ;
    }

    @DataProvider(name = "tieData")
    public Object [][] tieDataProvider() {
        return new Object[][] {

                {RPSEnum.PAPER,RPSEnum.PAPER, TIE},
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS, TIE},
                {RPSEnum.ROCK,RPSEnum.ROCK, TIE},

        } ;
    }
    */
    @Test ( dataProvider = "data")
    public void testWinPlay(RPSEnum p1, RPSEnum p2, Result res){

        //assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);
        assertEquals(rps.play(p1,p2),res);
    }
/*
    //@Parameters({"paper","paper"})
    @Test ( dataProvider = "data")
    public void testTiePlay(RPSEnum p1, RPSEnum p2, Result res){
        //assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
        assertEquals(rps.play(p1,p2),res);
    }

    //@Parameters({"scissors","rock"})
    @Test ( dataProvider = "data")
    public void testLostPlay(RPSEnum p1, RPSEnum p2 , Result res){
        //assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);
        assertEquals(rps.play(p1,p2),res);
    }
*/

}