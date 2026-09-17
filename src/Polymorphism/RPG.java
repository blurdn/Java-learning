package Polymorphism;

public class RPG extends Game {
    private int lvl = 0;

    @Override
    public void lose() {
        System.out.println("You lost The RPG!\n");
    }

    public void levelUp() {
        lvl++;
        System.out.println("You leveled up! Your new level is " + lvl + "!\n"); // r/unexpectedFactorial
    }
}
