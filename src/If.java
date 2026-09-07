import java.util.Random;

public class If {
    public static void main(String[] args) {
        Random rng = new Random();

        boolean is_true = rng.nextBoolean();

        if (is_true) {
            System.out.println("Yuh uh");
        } else {
            System.out.println("Nuh uh");
        }
    }
}
