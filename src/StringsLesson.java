public class StringsLesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello everybody");
        sb.append(" my name")
                .append(" is")
                .append(" Welcome");

        System.out.println(sb);
    }
}
