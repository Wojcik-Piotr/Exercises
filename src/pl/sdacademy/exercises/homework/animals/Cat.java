package pl.sdacademy.exercises.homework.animals;

public class Cat extends Pet {


    protected Cat(String getter) {
        super(getter);
    }

    @Override
    protected void makeSound() {
        System.out.println("Miau");
    }

    @Override
    protected void getCountOfLegs() {
        System.out.println("I have 4 legs.");
    }
}
