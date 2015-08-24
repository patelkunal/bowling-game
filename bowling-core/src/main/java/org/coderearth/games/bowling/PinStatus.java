package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/21/15.
 */
public class PinStatus {

    private int knockedPins = 0;

    public PinStatus() {
    }

    public PinStatus(int knockedPins) {
        this.knockedPins = knockedPins;
    }

    public int getKnockedPins() {
        return knockedPins;
    }

    public void setKnockedPins(int knockedPins) {
        this.knockedPins = knockedPins;
    }

    public void addKnockedPins(int knockedPins) {
        this.knockedPins += knockedPins;
    }

    public int remainingPins() {
        return GameConfig.getGameConfig().getNumberOfPins() - getKnockedPins();
    }
}
