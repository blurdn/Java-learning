public class ClassesAndObjects {
    public static void main(String[] args) {
        Person me = new Person();
        me.setName("Dmitrii");
        me.age = 19; // bad encapsulation or smth
        me.introLine = "uhhh idk";

        me.introduction();

        Person trickyTony = new Person();
        trickyTony.name = "Toby \"Don't call me Radiation\" Radiation Fox";
        trickyTony.age = 34;
        trickyTony.introLine = "am so tricky";

        trickyTony.introduction();

        int allAgesDoubledProduct = me.ageButDoubled() * trickyTony.ageButDoubled();
        System.out.println("big numba: " + allAgesDoubledProduct);
        System.out.println("potentially bigger numba: " + me.ageButCustomMultiplier(42424242));
    }
}

class Person {
    String name;
    int age;
    String introLine;

    void setName(String username) {
        name = username;
    }

    int ageButDoubled() {
        return age * 2;
    }

    int ageButCustomMultiplier(int multiplier) {
        return age * multiplier;
    }

    void introduction() {
        System.out.println("haii");
        System.out.println("my name is " + name + " and my age is " + age + " in case you need it for whatever reason");
        System.out.println(introLine);
        System.out.println("");
    }
}