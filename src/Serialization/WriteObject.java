package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Game game1 = new Game(253230, "A Hat in Time");
        Game game2 = new Game(2226280, "BAPBAP");

        try {
            FileOutputStream fos = new FileOutputStream("games.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(game1);
            oos.writeObject(game2);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
