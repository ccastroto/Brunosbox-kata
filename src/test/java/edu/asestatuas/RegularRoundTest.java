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



}
