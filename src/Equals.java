public class Equals {
    public static void main(String[] args) {
        Game game1 = new Game(1);
        Game game2 = new Game(1);

        System.out.println(game1.equals(game2));
    }
}

class Game {
    private final int id;

    public Game(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof Game game) {
            return this.id == game.id;
        }

        return false;
    }
}