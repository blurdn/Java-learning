public class MoreClasses {
    public static void main(String[] args) {
        Animal pet = new Animal("Harry", "this.animal");
        pet.getInfo();

        pet.setName("Niko");
        pet.setSpecies("cat");
        pet.getInfo();
    }
}

class Animal {
    private String name;
    private String species;

    public Animal() {
        System.out.println("so empty in those brackets");
        this.name = "NoName";
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
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
        System.out.println("Species: " + species);
    }
}
