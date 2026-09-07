import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] list = new int[42];
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 42;
        }
        System.out.println(Arrays.toString(list));

        String[] str_list = {"put", "smth", "cool", "here"};
        System.out.println(Arrays.toString(str_list));

        for (String str: str_list) {
            System.out.println(str);
        }

        String the_line = "";
        for (String str: str_list) {
            the_line += str + " "; // loose backspace at the end!!
        }
        System.out.println(the_line);
    }
}
