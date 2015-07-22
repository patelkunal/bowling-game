package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 7/22/15.
 */
public class BowlingGame {
    private static BowlingGame gameInstance = new BowlingGame();

    public static BowlingGame getInstance() {
        return gameInstance;
    }

    private BowlingGame() {
    }
}
