package Polymorphism;

import TestClasses.Game;
import TestClasses.RPG;

public class Test {
    public static void main(String[] args) {
        Game game = new RPG(); // defines only restrictions while using methods code from the child
        RPG rpg = new RPG();

        // game.levelUp(); nuh uh (rpg as a game (restricted to only TestClasses.Game class methods))
        // rpg.levelUp(); yuh uh (rpg as a... rpg)

        // game.lose(); we get the rpg lose message (what we did is called late binding)

        Game regularGame = new Game();

        test(regularGame);
        test(rpg); // it works because it has all TestClasses.Game methods
        test(game);
    }

    public static void test(Game game) {
        game.lose();
    }
}
