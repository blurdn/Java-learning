package moocfi.todolist;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> tasks = new ArrayList<>();

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }

    public void remove(int number) {
        try {
            tasks.remove(number - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Task " + number + " does not exist!");
        }
    }
}
