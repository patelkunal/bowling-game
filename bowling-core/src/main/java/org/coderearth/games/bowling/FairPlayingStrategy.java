package org.coderearth.games.bowling;

import java.util.Random;

/**
 * FairPlayingStrategy is simple implementation of PlayingStratey with Randomness considered in every roll
 * Created by kunal_patel on 8/23/15.
 */
public class FairPlayingStrategy implements PlayingStrategy {

    private Random randomPlayingStragey = new Random();

    @Override
    public PinStatus roll(int remainingPinsToKnock) {
        return new PinStatus(randomPlayingStragey.nextInt(remainingPinsToKnock));
    }

    @Override
    public String getStrategyName() {
        return "FairAndRandomPlayingStrategy";
    }

    @Override
    public String toString() {
        return this.getStrategyName();
    }
}
