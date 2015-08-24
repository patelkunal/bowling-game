package org.coderearth.games.bowling;

import com.google.common.base.MoreObjects;

import java.util.Random;

/**
 * Created by kunal_patel on 8/21/15.
 */
public class Player {

    private String name = null;

    private PlayingStrategy playingStrategy = null;

    public Player(String name, PlayingStrategy playingStrategy) {
        this.name = name;
        this.playingStrategy = playingStrategy;
    }

    private int currentScore = 0; // as of now - not sure about usage of this.

    public PinStatus play(final int numberOfPinsToTarget) {
        return this.rollBall(numberOfPinsToTarget);
    }

    private PinStatus rollBall(final int numberOfPinsToTarget) {
        return getPlayingStrategy().roll(numberOfPinsToTarget);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper("Player").add("name", this.name).add("PlayingStrategy", this.getPlayingStrategy()).add("score", getCurrentScore()).toString();
    }

    public PlayingStrategy getPlayingStrategy() {
        return this.playingStrategy;
    }
}
