package alishev;

import alishev.testclasses.Game;
import alishev.testclasses.RPG;

public class Polymorphism {
    public static void main(String[] args) {
        Game game = new RPG(); // defines only restrictions while using methods code from the child
        RPG rpg = new RPG();

        // game.levelUp(); nuh uh (rpg as a game (restricted to only Alishev.TestClasses.Alishev.Game class methods))
        // rpg.levelUp(); yuh uh (rpg as a... rpg)

        // game.lose(); we get the rpg lose message (what we did is called late binding)

        Game regularGame = new Game();

        test(regularGame);
        test(rpg); // it works because it has all Alishev.TestClasses.Alishev.Game methods
        test(game);
    }

    public static void test(Game game) {
        game.lose();
    }
}
