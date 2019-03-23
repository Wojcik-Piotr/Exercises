package pl.sdacademy.exercises.homework.animals;

public class Dog extends Pet {
    protected Dog(String getter) {
        super(getter);
    }

    @Override
    protected void makeSound() {
        System.out.println("Hau");
    }

    @Override
    protected void getCountOfLegs() {
        System.out.println("I have 4 legs.");
    }
}
