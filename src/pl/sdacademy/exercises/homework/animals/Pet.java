package pl.sdacademy.exercises.homework.animals;

public abstract class Pet {
    protected String petCover;

    protected Pet(String petCover) {
        this.petCover = petCover;
    }

    protected abstract void makeSound();

    protected abstract void getCountOfLegs();
}
