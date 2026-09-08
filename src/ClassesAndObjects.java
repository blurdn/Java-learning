public class ClassesAndObjects {
    public static void main(String[] args) {
        Person me = new Person();
        me.setName("Dmitrii");
        me.setAge(19);
        me.setIntroLine("uhhh idk");

        me.introduction();

        Person trickyTony = new Person();
        trickyTony.setName("Toby \"Don't call me Radiation\" Radiation Fox");
        trickyTony.setAge(34);
        trickyTony.setIntroLine("am so tricky");

        trickyTony.introduction();

        int allAgesDoubledProduct = me.ageButDoubled() * trickyTony.ageButDoubled();
        System.out.println("big numba: " + allAgesDoubledProduct);
        System.out.println("potentially bigger numba: " + me.ageButCustomMultiplier(42424242));
        System.out.println("also I need to get something using get method but don't really have a creative reason to do so here it is: " + me.getName());
    }
}

class Person {
    private String name;
    private int age;
    private String introLine;

    public void setName(String username) {
        if (!username.isEmpty()) {
            name = username;
        }
        else {
            System.out.println("can't set an empty name why would you do that");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIntroLine(String introLine) {
        this.introLine = introLine;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIntroLine() {
        return introLine;
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