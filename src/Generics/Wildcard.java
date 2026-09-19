package Generics;

import TestClasses.Game;
import TestClasses.RPG;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<Game> gameList = new ArrayList<>();
        gameList.add(new Game(481510));
        gameList.add(new Game(4576490));

        List<RPG> rpgList = new ArrayList<>();
        rpgList.add(new RPG());
        rpgList.add(new RPG());

        test(gameList);
        test(rpgList);
    }

    private static void test(List<? extends Game> list) { // list of any classes extending Game
        for (Game game : list) {
            System.out.println(game);
        }
    }
}
