package TestClasses;

public class RPG extends Game {
    public int lvl;

    public RPG() {

    }

    public RPG(int steamID) {
        super(steamID);
    }

    public void showInfo() {
        System.out.println("The game ID is " + steamID);
        System.out.println("Current level is " + lvl + "\n");
    }

    public void levelUp() {
        lvl += 1;
        System.out.println("You leveled up! Your new level is " + lvl + "\n");
    }
}
