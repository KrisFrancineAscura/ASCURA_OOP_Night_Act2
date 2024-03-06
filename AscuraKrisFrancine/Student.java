package AscuraKrisFrancine;

public class Student {
    // Properties
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    // Constructor
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    // Methods
    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public void celebrateBirthday() {
        age++;
        isMinor = age < 18;
    }

    @Override
    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return getFullName() + " - " + age + " - " + status;
    }
}

