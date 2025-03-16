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
}
