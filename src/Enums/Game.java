package Enums;

public enum Game {
    DELTARUNE(1997), ULTRAKILL(12), OSU(3);
    // ^^^^ instances of Game enum
    // which extends Enum class

    private final int id;

    Game(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
