package TestClasses;

import Interfaces.Info;

public class Game implements Info {
    public long steamID;

    public Game() {

    }

    public Game(int steamID) {
        this.steamID = steamID;
    }

    @Override
    public String toString() {
        return String.valueOf(steamID);
    }

    public void showInfo() {
        System.out.println("The game ID is " + steamID + "\n");
    }

    public void play() {
        System.out.println("You started playing the game...\n");
    }

    public void lose() {
        System.out.println("You lost The Game!");
    }
}
