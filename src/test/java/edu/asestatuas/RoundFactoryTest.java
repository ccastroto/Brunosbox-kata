package edu.asestatuas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoundFactoryTest {

    private RoundFactory roundFactory;

    @Before
    public void setUp() {
        roundFactory = new RoundFactory();
        RoundFactory.getRound("10 - 9");
        RoundFactory.getRound("9 -10");
        RoundFactory.getRound("10 - 8");
        RoundFactory.getRound("8 -10");
        RoundFactory.getRound("10 - 8 ,1");
        RoundFactory.getRound("1, 8 - 10");
    }

    @Test
    public void testgetRegularRound() {
        assertEquals("10 - 9", "10 - 9");
        assertEquals("9 - 10", "9 - 10");
    }
    @Test
    public void testgetKnockdownRound() {
        assertEquals("10 - 8", "10 - 8");
        assertEquals("8 - 10", "8 - 10");
    }
    @Test
    public void testgetPointsDeductedRound() {
        assertEquals("10 - 8 ,1", "10 - 8 ,1");
        assertEquals("1, 8 - 10", "1, 8 - 10");
    }

}
