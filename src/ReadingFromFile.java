import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String sep = File.separator;
//        String path = "D:" + sep + "smth.txt";

        File file = new File("smth.txt");
        Scanner scanner = new Scanner(file);

        String line =  scanner.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
