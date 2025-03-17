package edu.asestatuas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreCardTest {

    private ScoreCard card;

    private String[] whiteScoreCard =  {"9 - 10",
            "9 - 10",
            "9 - 10",
            "9 - 10",
            "10 - 9",
            "10 - 9",
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "9 - 10"};

    private String[] pinkScoreCard = {"9 - 10",
            "9 - 10",
            "9 - 10",
            "1, 8 - 10", // referee point deduction
            "10 - 8",    // knockdown
            "10 - 8 ,1", // referee point deduction
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "10 - 8"};

    @Before
    public void setup() {
        card = new ScoreCard("white");
    }

    @Test
    public void testColor() {
        assertEquals(card.getColor(), "white");
    }

    @Test
    public void testSetBCorner() {
        card = new ScoreCard("blue");
        card.setBCorner("Rocky Balboa");
        assertEquals("Rocky Balboa", "Rocky Balboa");
    }
    @Test
    public void testSetRCorner() {
        card = new ScoreCard("red");
        card.setBCorner("Apollo Creed");
        assertEquals("Apollo Creed", "Apollo Creed");
    }
    @Test
    public void testGetNumRounds() {
        card = new ScoreCard("blue");
        assertEquals(card.getNumRounds(), 0);
    }
    @Test
    public void testloadJudgeScoreCard() {
        card = new ScoreCard("blue");
        String[] judgeScoreCard = {"10-9", "9-10"};
        card.loadJudgeScoreCard(judgeScoreCard);
        assertEquals(card.getNumRounds(), 0);
        assertEquals(0, card.getNumRounds());
    }
    @Test
    public void testgetRedBoxerScoreFinal() {
        card = new ScoreCard("red");
        String[] redBoxerScoreFinal = {"10-9", "9-10"};
        card.loadJudgeScoreCard(redBoxerScoreFinal);
        assertEquals(card.getRedBoxerScoreFinal(), 0);
    }
    @Test
    public void testgetBlueBoxerScoreFinal() {
        card = new ScoreCard("blue");
        String[] blueBoxerScoreFinal = {"10-9", "9-10"};
        card.loadJudgeScoreCard(blueBoxerScoreFinal);
        assertEquals(card.getBlueBoxerScoreFinal(), 0);
    }

    @Test
    public void loadJudgeScoreCardRoundFactoryRegularTest() {

        card.loadJudgeScoreCard(whiteScoreCard);
        assertEquals(10, card.getNumRounds());
        assertTrue(card.getRounds().stream().allMatch(a -> a instanceof RegularRound));
    }

    @Test
    public void loadJudgeScoreCardRoundFactoryNullTest() {
        card.loadJudgeScoreCard(new String[]{null, null});
        assertEquals(0, card.getNumRounds());
    }

    @Test
    public void loadJudgeScoreCardRoundFactoryPointsDeductedTest() {

        card.loadJudgeScoreCard(pinkScoreCard);
        assertEquals(10, card.getNumRounds());
        assertEquals(2, card.getRounds().stream().filter(a -> a instanceof PointsDeducted).count());
    }


    @Test
    public void loadJudgeScoreCardRoundFactoryKnockDownTest() {

        card.loadJudgeScoreCard(pinkScoreCard);
        assertEquals(10, card.getNumRounds());
        assertEquals(2, card.getRounds().stream().filter(a -> a instanceof KnockdownRound).count());
    }

    @Test
    public void getBoxerFinalScoreTest() {
        assertEquals(0, card.getRedBoxerScoreFinal());
        assertEquals(0, card.getBlueBoxerScoreFinal());
        card.loadJudgeScoreCard(whiteScoreCard);
        assertEquals(94, card.getRedBoxerScoreFinal());
        assertEquals(96, card.getBlueBoxerScoreFinal());
    }
}
