import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("input 42 plz");
            value = scanner.nextInt();
            if (value == 42) {
                System.out.println("good boy");
                break;
            } else if (value == 5) {
                System.out.println("why would you enter 5 are you stupid");
            }
        } while (value != 5);

        System.out.println("u did it!!1!");

        for (int i = 0; i < 5; i++) {
            System.out.println("now do it again. u have " + (5 - i) + " attempts left");
            value = scanner.nextInt();

            if (value == 5) {
                System.out.println("why...");
                continue; // should've used else if but whatever I can't come up with anything better
            }
            if (value == 42) {
                break;
            }
        }

        System.out.printf("who's a gooood booyy? youu are a gooood boyy! yippee :boykisser_happy:");
    }
}
