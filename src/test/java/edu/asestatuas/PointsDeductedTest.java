package edu.asestatuas;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointsDeductedTest {

    private PointsDeducted pointsDeducted;

    @Test
    public void testPointsDeducted(){
        this.pointsDeducted = new PointsDeducted("10-8,1");
        assertEquals(this.pointsDeducted.getRoundScore(), "10-8,1");
    }


    @Test
    public void replaceTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals(round.getRoundScore(), "10-8,1");
        round = new PointsDeducted("1, 8 - 10");
        assertEquals(round.getRoundScore(), "1,8-10");
    }

    @Test
    public void roundScoreToIntBlueTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals(round.getRoundScore(), "10-8,1");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }

    @Test
    public void roundScoreToIntRedTest() {
        PointsDeducted round = new PointsDeducted("1, 8 - 10");
        assertEquals(round.getRoundScore(), "1,8-10");
        assertEquals(8, round.getRedBoxerScore());
        assertEquals(10, round.getBlueBoxerScore());
    }
}
