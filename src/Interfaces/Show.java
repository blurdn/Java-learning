package Interfaces;

public class Show implements Info { // can implement any amount of interfaces!!
    public String name;

    public Show(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("The show is called " + name + "\n");
    }

    public void watch() {
        System.out.println("You started watching the show...\n");
    }
}
