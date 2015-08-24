package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/22/15.
 */
public class DefaultScoringStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(PinStatus aPinStatus, int aRoundIndex, int aTurnIndex) {
        return 0;
    }

    @Override
    public boolean isSpare(PinStatus aPinStatus) {
        return false;
    }

    @Override
    public boolean isStrike(PinStatus aPinStatus) {
        return false;
    }
}
