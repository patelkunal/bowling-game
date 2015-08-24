package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/22/15.
 */
public class Scorer {

    private final GameConfig gameConfig;
    private ScoreBoard scoreBoard;

    private ScoringStrategy strategy;

    public Scorer(ScoreBoard scoreBoard, ScoringStrategy strategy) {
        this.scoreBoard = scoreBoard;
        this.strategy = strategy;
        gameConfig = GameConfig.getGameConfig();
    }

    public boolean isLastRound(final int aRoundIndex) {
        return ((gameConfig.getNumberOfRounds() - 1) == aRoundIndex);
    }

    public void updateScoreBoard(Player player, PinStatus aPinStatus, int aRoundIndex, int aTurnIndex) {

    }

}
