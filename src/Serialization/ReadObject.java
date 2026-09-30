package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("games.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Game game1 = (Game) ois.readObject();
            Game game2 = (Game) ois.readObject();
            Game[] games = (Game[]) ois.readObject();

            ois.close();

            System.out.println(game1);
            System.out.println(game2);
            System.out.println(Arrays.toString(games));

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
