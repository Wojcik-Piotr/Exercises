package pl.sdacademy.beginner.day6.zad1;

public abstract class AbstractAnimal {

    private int age;

    public AbstractAnimal(int age) {
        this.age = age;
    }

    public abstract void eat();

    public abstract void makeSound();

    public int getAge() {
        return age;
    }
}
