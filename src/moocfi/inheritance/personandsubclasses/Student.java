package moocfi.inheritance.personandsubclasses;

public class Student extends Person {
    private int studyCredits;

    public Student(String fullName, String address) {
        super(fullName, address);
        studyCredits = 0;
    }

    public void study() {
        studyCredits++;
    }

    public int credits() {
        return studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + studyCredits;
    }
}
