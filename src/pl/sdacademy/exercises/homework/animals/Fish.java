package pl.sdacademy.exercises.homework.animals;

public class Fish extends Pet implements WaterBeing {
    protected Fish(String getter) {
        super(getter);
    }

    @Override
    protected void makeSound() {
        System.out.println("Bul, bul");
    }

    @Override
    protected void getCountOfLegs() {
        System.out.println("I don't have legs.");
    }

    @Override
    public void brathUnderWater() {
        System.out.println("Bul, bul");
    }
}
