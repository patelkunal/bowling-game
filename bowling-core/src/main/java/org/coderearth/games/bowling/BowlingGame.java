package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 7/22/15.
 */
public class BowlingGame {

    private final GameConfig gameConfig;
    private PlayerPool playerPool;

    private Scorer scorer;

    public BowlingGame(Scorer scorer, PlayerPool playerPool) {
        this.scorer = scorer;
        this.playerPool = playerPool;
        gameConfig = GameConfig.getGameConfig();
    }

    public void startGame() {
        if (this.playerPool == null) {
            throw new RuntimeException("No players are associated for the game to start");
        }
        if (this.scorer == null) {
            throw new RuntimeException("No scorer is assigned for this game");
        }
        this.start();
    }

    private void start() {

        /**
         * Flow -
         * 1. Iterate through all rounds - special case of last round
         * 2. Iterate through all players in playerPool and collect PinStatus
         * 3. Pass the pin status to Scorer and scorer will maintain scoreboard
         * 4. at end of every iteration ask scorer to show the scoreboard
         */

        for (int roundIndex = 0; roundIndex < gameConfig.getNumberOfRounds(); roundIndex++) {
            for (Player player : playerPool.getPlayers()) {
                PinStatus knockedPins = null;
                if (scorer.isLastRound(roundIndex)) {

                } else {
                    knockedPins = player.play(gameConfig.getNumberOfPins());
                    int remainingPinsToTarget = knockedPins.remainingPins();
                    if(scorer.)
                    player.play(remainingPinsToTarget);
                }

            }
        }

    }

    public void finishGame() {
        this.playerPool = null;
        this.scorer = null;
    }

    public PlayerPool getPlayerPool() {
        return playerPool;
    }

    public void setPlayerPool(PlayerPool playerPool) {
        this.playerPool = playerPool;
    }

    public Scorer getScorer() {
        return scorer;
    }

    public void setScorer(Scorer scorer) {
        this.scorer = scorer;
    }

}
