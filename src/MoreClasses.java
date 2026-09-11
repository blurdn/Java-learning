public class MoreClasses {
    public static void main(String[] args) {
        Animal pet = new Animal("Harry", "this.animal");
        pet.getInfo();

        Animal.description = "I don't want to be this.animal anymore";
        Animal.printDescription();

        pet.setName("Niko");
        pet.setSpecies("cat");
        pet.getInfo();
        pet.printAnimalCount();

        Animal smth = new Animal();
        smth.printAnimalCount();

        double power = Math.pow(2, 32); // an example of static method
        double pi = Math.PI; // a static final variable
    }
}

class Animal {
    private String name;
    private String species;

    private static int animalCount;
    public static String description;

    public Animal() {
        System.out.println("so empty in those brackets");
        this.name = "NoName";
        animalCount++;
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        animalCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species + "\n");
    }

    public static void printDescription() {
        System.out.println(description);
    }

    public void printAnimalCount() {
        System.out.println("there are " + animalCount + " animal(s)");
    }
}
