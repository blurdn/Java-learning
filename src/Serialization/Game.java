package Serialization;

import java.io.Serializable; // makes class serializable

public class Game implements Serializable {
    long steamId;
    String name;

    public Game(int steamId, String name) {
        this.steamId = steamId;
        this.name = name;
    }

    public long getSteamId() {
        return steamId;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return steamId + ":" + name;
    }
}
