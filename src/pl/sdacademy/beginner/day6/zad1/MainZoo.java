package pl.sdacademy.beginner.day6.zad1;

public class MainZoo {
    public static void main(String[] args) {
        OneSpeciesZoo<AbstractAnimal> zoo= new OneSpeciesZoo<>();
        zoo.addAnimal(new Cat(2));
        zoo.addAnimal(new Dog(3));
        zoo.addAnimal(new Tiger(6));
        zoo.seeAnimalInTheZoo();
        zoo.theOldestAnimalScream();
    }
}
