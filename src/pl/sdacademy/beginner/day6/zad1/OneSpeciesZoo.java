package pl.sdacademy.beginner.day6.zad1;

import java.util.ArrayList;

public class OneSpeciesZoo<Animal extends AbstractAnimal> {

    private ArrayList<Animal> animals;

    public OneSpeciesZoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal get(int i) {
        return animals.get(i);
    }

    public void seeAnimalInTheZoo() {
        for (Animal temp : animals) {
            temp.eat();
            temp.makeSound();
        }
    }

    public void sightSeeZoo() {
        for (Animal temp : animals) {
            System.out.println(temp.getAge());
            temp.makeSound();
        }
    }
    public void theOldestAnimalScream() {
        if (!animals.isEmpty()) {
            Animal x = get(0);
            for (Animal temp : animals) {
                if (x.getAge() < temp.getAge()) {
                    x = temp;
                }
            }
            x.makeSound();
        }else {
            System.out.println("No animals!");
        }
    }


}
