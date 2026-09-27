package TestClasses;

public class Platformer extends Game {
    public Platformer() {}

    public Platformer(int steamID) {
        super(steamID);
    }

    @Override
    public void showInfo() {
        System.out.println("jumpy jumps");
        System.out.println("The platformer game ID is " + steamID + "\n");
    }
}
