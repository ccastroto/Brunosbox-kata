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

}
