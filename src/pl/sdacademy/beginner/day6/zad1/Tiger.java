package pl.sdacademy.beginner.day6.zad1;

public class Tiger extends Cat {
    public Tiger(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
