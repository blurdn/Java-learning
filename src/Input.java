import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        final int WAITING_TIME = 3;

        String wtf = new String("why would I use it");

        Scanner scan = new Scanner(System.in);
        System.out.println("input smth idk bro");
        String str = scan.nextLine();
        System.out.print("you entered");

        for (int i = 0; i < WAITING_TIME; i++) {
            System.out.print(".");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(" FUCK YOU I'M NOT GIVING YOU ANY CONTROL HERE");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("alright fr this time enter a number");
        int number = scan.nextInt();
        System.out.print("you entered");

        for (int i = 0; i < WAITING_TIME; i++) {
            System.out.print(".");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(" LMAOOO TWICE");
    }
}
