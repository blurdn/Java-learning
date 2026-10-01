package Enums;

public class Test {
    public static void main(String[] args) {
        Game game = Game.DELTARUNE;

        System.out.println(game instanceof Enum);
        System.out.println(game.getClass());
        System.out.println(game.getId());

        Game anotherGame = Game.valueOf("OSU"); // get enum instance from string
        System.out.println(anotherGame.getId());
        System.out.println(anotherGame.ordinal()); // get enum instance index

        switch (game) {
            case DELTARUNE -> System.out.println("do you want to be a BIG shot?");
            case ULTRAKILL -> System.out.println("RECONSTRUCT WHAT?!");
            case OSU -> System.out.println("click the circles!");
        }
    }
}
