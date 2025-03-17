package edu.asestatuas;

import org.junit.Test;
import static org.junit.Assert.*;


public class RegularRoundTest {

    private RegularRound regularRound;

    @Test
    public void testgetRoundScore() {
        this.regularRound = new RegularRound("10-9");
        assertEquals(this.regularRound.getRoundScore(),"10-9");
    }
    @Test
    public void testgetRedBoxerScore() {
        this.regularRound = new RegularRound("10-9");
        assertEquals(this.regularRound.getRedBoxerScore(),10);
    }
    @Test
    public void testgetBlueBoxerScore() {
        this.regularRound = new RegularRound("10-9");
        assertEquals(this.regularRound.getBlueBoxerScore(),9);
    }
    @Test
    public void testtoString(){
        this.regularRound = new RegularRound("10-9");
        assertEquals(this.regularRound.toString(),"10 - 9");
    }

    @Test
    public void replaceTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
    }

    @Test
    public void roundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }
}
