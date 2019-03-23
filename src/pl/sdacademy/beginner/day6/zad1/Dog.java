package pl.sdacademy.beginner.day6.zad1;

public class Dog extends AbstractAnimal {

    public Dog(int age){
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("on nion nion");
    }

    @Override
    public void makeSound() {
        System.out.println("hau");
    }
}
