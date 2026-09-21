import TestClasses.Game;
import TestClasses.RPG;

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // Upcasting
        Game game = new RPG();

        RPG rpg = new RPG();
        Game game1 = rpg;

        // Downcasting
        RPG rpg1 = (RPG) game;
        rpg1.levelUp();

        // Downcasting can cause errors!
        Game genericGame = new Game();
        RPG genericRPG = (RPG) genericGame;
        genericRPG.levelUp(); // Exception! cuz conversion doesn't actually change object types, it only changes its link
    }

}
