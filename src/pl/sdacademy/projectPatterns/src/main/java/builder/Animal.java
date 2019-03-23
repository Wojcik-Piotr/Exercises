package pl.sdacademy.projectPatterns.src.main.java.builder;

public class Animal {
    private String name;
    private int age;
    private Heart heart;


    public Animal(Animal animalToCopy) {
        this.name = animalToCopy.getName();
        this.age = animalToCopy.getAge();
        this.heart = new Heart(animalToCopy.getHeart());
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Heart getHeart() {
        return heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
