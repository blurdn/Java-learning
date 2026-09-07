import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        String[][] hello = {
                {"Hello", "everybody"},
                {"my", "name", "is", "Markiplier"},
                {"and", "welcome", "to"}
        };
        System.out.println(Arrays.deepToString(hello));

        for (int i = 0; i < hello.length; i++) {
            for (int j = 0; j < hello[i].length; j++) {
                System.out.print(hello[i][j] + " ");
            }
        }
        System.out.println("");
        for (String[] str_array: hello) {
            for (String str: str_array) {
                System.out.print(str + " ");
            }
        }
    }
}
