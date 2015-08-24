package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/23/15.
 */
public interface PlayingStrategy {

    public PinStatus roll(int remainingPinsToKnock);

    public String getStrategyName();

}
