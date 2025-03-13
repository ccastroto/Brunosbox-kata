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
    @Test
    public void testloadJudgeScoreCard() {
        scoreCard = new ScoreCard("blue");
        String[] judgeScoreCard = {"10-9", "9-10"};
        scoreCard.loadJudgeScoreCard(judgeScoreCard);
        assertEquals(scoreCard.getNumRounds(), 0);
        assertEquals(0, scoreCard.getNumRounds());
    }
}
