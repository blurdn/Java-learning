package moocfi.todolist;

import java.util.Objects;
import java.util.Scanner;

public class UserInterface {
    private final TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (Objects.equals(input, "stop")) {
                return;
            } else if (Objects.equals(input, "add")) {
                add();
            } else if (Objects.equals(input, "list")) {
                todoList.print();
            } else if (Objects.equals(input, "remove")) {
                remove();
            }
        }
    }

    private void add() {
        System.out.print("To add: ");
        todoList.add(scanner.nextLine());
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        todoList.remove(Integer.parseInt(scanner.nextLine()));
    }
}
