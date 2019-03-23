package pl.sdacademy.beginner.day5.zad1;

public class Person implements IPerson {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return ("Name: " + firstName + " Lastname: " + lastName);
    }
}

