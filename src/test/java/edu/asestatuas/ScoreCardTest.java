package edu.asestatuas;

import edu.asestatuas.ScoreCard;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreCardTest {

    private ScoreCard scoreCard;


    @Test
    public void testColor() {
        scoreCard = new ScoreCard("white");
        assertEquals(scoreCard.getColor(), "white");
    }
    @Test
    public void testSetBCorner() {
        scoreCard = new ScoreCard("blue");
        scoreCard.setBCorner("Rocky Balboa");
        assertEquals("Rocky Balboa", "Rocky Balboa");
    }
    @Test
    public void testSetRCorner() {
        scoreCard = new ScoreCard("red");
        scoreCard.setBCorner("Apollo Creed");
        assertEquals("Apollo Creed", "Apollo Creed");
    }
    @Test
    public void testGetNumRounds() {
        scoreCard = new ScoreCard("blue");
        assertEquals(scoreCard.getNumRounds(), 0);
    }
}
