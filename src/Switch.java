import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your length");
        int value = scanner.nextInt();

        switch (value) {
            case 10, 11, 12 -> System.out.println("smol");
            case 13, 14, 15, 16, 17 -> System.out.println("average");
            case 18, 19, 20, 21, 22 -> System.out.println("damn");
            case 69 -> System.out.println("nice");
            default -> System.out.println("I don't believe you / input length not height");
        }
    }
}
