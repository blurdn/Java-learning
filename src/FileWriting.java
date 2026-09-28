import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriting {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("writeSomethingInMePleaseIBegYou");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Something");
        pw.print("\n\n\n thanks.");

        pw.close();
    }
}
