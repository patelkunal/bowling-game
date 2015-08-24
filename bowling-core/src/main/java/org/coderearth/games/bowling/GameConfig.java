package org.coderearth.games.bowling;

/**
 * Created by kunal_patel on 8/23/15.
 */
public class GameConfig {

    private int numberOfPins;
    private int numberOfRounds;
    private int maxNumberOfPlayersPerGame;
    private char strikeSymbol;
    private char spareSymbol;

    private GameConfig() {
        this(10, 10, 5, 'X', '/');
    }

    private GameConfig(int numberOfPins, int numberOfRounds, int maxNumberOfPlayersPerGame, char strikeSymbol, char spareSymbol) {
        this.numberOfPins = numberOfPins;
        this.numberOfRounds = numberOfRounds;
        this.maxNumberOfPlayersPerGame = maxNumberOfPlayersPerGame;
        this.strikeSymbol = strikeSymbol;
        this.spareSymbol = spareSymbol;
    }

    private static GameConfig configInstance = new GameConfig();

    public static GameConfig getGameConfig(){
        return configInstance;
    }

    public int getMaxNumberOfPlayersPerGame() {
        return maxNumberOfPlayersPerGame;
    }

    public int getNumberOfPins() {
        return numberOfPins;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public char getSpareSymbol() {
        return spareSymbol;
    }

    public char getStrikeSymbol() {
        return strikeSymbol;
    }

}
