package edu.asestatuas;

import org.junit.Test;
import static org.junit.Assert.*;

public class KnockdownRoundTest {

    private KnockdownRound knockdownRound;

    @Test
    public void testgetRoundScore() {
        this.knockdownRound = new KnockdownRound("10-8");
        assertEquals(this.knockdownRound.getRoundScore(),"10-8");
    }

    @Test
    public void replaceTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        assertEquals(round.getRoundScore(), "10-8");
    }

    @Test
    public void roundScoreToIntTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        assertEquals(round.getRoundScore(), "10-8");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }
}
