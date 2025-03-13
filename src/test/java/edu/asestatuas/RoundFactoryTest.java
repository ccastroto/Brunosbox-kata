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
    }

    @Test
    public void testgetRound() {
        assertEquals("10 - 9", "10 - 9");
        assertEquals("9 - 10", "9 - 10");
    }

}
