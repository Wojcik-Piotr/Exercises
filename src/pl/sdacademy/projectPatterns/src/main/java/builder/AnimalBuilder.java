package pl.sdacademy.projectPatterns.src.main.java.builder;

public class AnimalBuilder {
    private String name;
    private int age;

    private AnimalBuilder() {
    }

    public static AnimalBuilder anAnimal() {
        return new AnimalBuilder();
    }

    public AnimalBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder withAge(int age) {
        this.age = age;
        return this;
    }
    protected Animal createAnimal(){
        return new Animal(name,age);
    }
}
