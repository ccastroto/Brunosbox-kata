package edu.asestatuas;

import edu.asestatuas.Round;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoundTest {

    private  Round round;

    @Before
    public void setUp(){
        round = new Round();
    }

    @Test
    public void testboxerRound(){
        round.boxerRoundScore();
        assertEquals(round.boxerRoundScore(),0);
    }
}
