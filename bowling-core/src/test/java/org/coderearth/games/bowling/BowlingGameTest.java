package org.coderearth.games.bowling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kunal_patel on 7/22/15.
 */
public class BowlingGameTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetInstance() throws Exception {
        assertNotNull(BowlingGame.getInstance());
    }
}