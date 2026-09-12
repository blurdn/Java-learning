public class StringsLesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello everybody");
        sb.append(" my name")
                .append(" is")
                .append(" Welcome");

        System.out.println(sb);

        System.out.printf("some formatted text %s\n", "HERE");
        System.out.printf("and digits!! %s %d\n", "here:", 80085);
        System.out.printf("also we got a looooot of space for digits (it's not used tho): %15d. nice\n", 42);
        System.out.printf("and the other way around! %-15d. nice\n", 42);
        System.out.printf("and we can round numbers: %.2f!!\n", 800.847023425);
        System.out.println("r/unexpectedFactorial");
    }
}
