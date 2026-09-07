public class TheLoops {
    public static void main(String[] args) {
        int value = 0;
        boolean t = value > 5;
        while (value < 10) { // ctr + shift + enter to auto place figure brackets!!
            System.out.println(value);
            value += 1;
        }

        for (int i = 0; i < 10; i++) { // i++ == i += 1
            System.out.println("For The loop " + i);
        }
    }
}
