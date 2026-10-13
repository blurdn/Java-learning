package moocfi;

import java.util.ArrayList;

public class Stack {

    private final ArrayList<String> data = new ArrayList<>();

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void add(String value) {
        data.add(value);
    }

    public ArrayList<String> values() {
        return data;
    }

    public String take() {
        return data.removeLast();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
