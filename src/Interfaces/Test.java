package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Show("Breaking Bad");
        Info info2 = new Game(1671210);
        RPG rpg1 = new RPG(489830);

        outputInfo(info1);
        outputInfo(info2);
        outputInfo(rpg1);

        rpg1.levelUp();
        rpg1.showInfo();
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
