package Generics;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {

        // before generics
        List games = new ArrayList();

        games.add("Disco Elysium");
        games.add("Deltarune");
        games.add("Journey");

        String game = (String) games.get(1);
        System.out.println(game);


        // with generics
        List<String> games1 = new ArrayList<String>();

        games1.add("Disco Elysium");
        games1.add("Deltarune");
        games1.add("Journey");

        String game1 = games1.get(1);
        System.out.println(game1);


        // Java 7+
        List<String> games2 = new ArrayList<>(); // no need to indicate class second time!!

        // Java 10+
        var games3 = List.of("Disco Elysium", "Deltarune", "Journey"); // can't add new objects tho
        // var automatically uses the correct type
    }
}
