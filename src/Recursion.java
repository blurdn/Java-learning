public class Recursion {
    public static void main(String[] args) {
        counter(1000);
        System.out.println(factorialAbs(-5));
    }

    private static void counter(int n) {
        System.out.println(n);

        if (n > 0) {
            counter(n - 1);
        }
    }

    // I know that you should make them two independent methods
    // I just don't know how to make it work properly with negative numbers
    // TODO: fix this
    private static int factorialAbs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (n > 0) {
            return n * factorialAbs(n - 1);
        } else {
            return -1 * n * factorialAbs(n + 1);
        }
    }
}
