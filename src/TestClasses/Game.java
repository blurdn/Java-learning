package TestClasses;

import Interfaces.Info;

public class Game implements Info {
    public int steamID;

    public Game() {

    }

    public Game(int steamID) {
        this.steamID = steamID;
    }

    public void showInfo() {
        System.out.println("The game ID is " + steamID + "\n");
    }

    public void play() {
        System.out.println("You started playing the game...\n");
    }
}
