package org.coderearth.games.bowling;

import java.util.Set;

/**
 * Created by kunal_patel on 8/22/15.
 */
public class PlayerPool {

    private Set<Player> players = null;

    public PlayerPool() {
        // TODO - Not yet required
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players.addAll(players);
    }

    public void addPlayer(Player aPlayer){
        this.players.add(aPlayer);
    }

}
