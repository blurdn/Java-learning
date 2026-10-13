package alishev.accesstest;

public class Test2 {

    public static void main(String[] args) {
        NotPublic test = new NotPublic();
        test.smth = "das";
    }
}
