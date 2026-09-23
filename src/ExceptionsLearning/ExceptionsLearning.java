package ExceptionsLearning;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsLearning {
    public static void main(String[] args) throws IOException, SadUserException {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("r u happy?");
            String response = scanner.nextLine();

            switch (response) {
                case "yes" -> System.out.println("niccee!! happy for u");
                case "no" -> {
                    System.out.println("aw.. hope it gets better!!");
                    throw new SadUserException("Come back when you are happy.");
                }
                default -> throw new IOException(); // Checked Exception (Compile time exception)
            }

            System.out.println("okay now let's divide by 0");
            System.out.println(1 / 0); // Unchecked Exception (Runtime exception)
            // we can also catch these, but it's kinda pointless: shouldn't let them occur in the first place
        }
    }
}
