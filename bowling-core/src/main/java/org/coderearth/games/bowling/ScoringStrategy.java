package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/22/15.
 */
public interface ScoringStrategy {

    public int calculateScore(PinStatus aPinStatus, int aRoundIndex, int aTurnIndex);

    public boolean isSpare(final PinStatus aPinStatus);

    public boolean isStrike(final PinStatus aPinStatus);

}
