import AccessTest.AccessTest;

public class AccessModifiers extends AccessTest {
    String smth;

    public static void main(String[] args) {
        // public, private, default, protected
        // public can be accessed from anywhere
        // private can be used only inside this class
        // default (package) is the default one (wow). can be accessed from the same package
        // protected can be accessed from the same package + all subclasses (even from another package)

        // classes can be either public or default
        // main class must be public. only 1 class per file can be public

        AccessTest smth = new AccessTest();
        // smth.id = 10; no access. BUT!
    }

    public AccessModifiers() {
        id = 24; // we can do it because we edit this subclass value, not the original one
    }
}

class AccessOutsideOfPackage extends AccessTest {
    public void main(String[] args) {
        System.out.println(id);
    }
}
