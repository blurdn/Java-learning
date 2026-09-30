package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("games.bin"))){
            // try-with-resources - don't need to close the stream manually if we do this ^^^^
            Game game1 = (Game) ois.readObject();
            Game game2 = (Game) ois.readObject();
            Game[] games = (Game[]) ois.readObject();

            System.out.println(game1);
            System.out.println(game2);
            System.out.println(Arrays.toString(games));

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
