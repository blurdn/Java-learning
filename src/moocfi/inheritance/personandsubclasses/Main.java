package moocfi.inheritance.personandsubclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(ada);
        persons.add(ollie);

        printPersons(persons);
    }
}
