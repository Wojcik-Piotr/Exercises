package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public abstract class Drink {
    protected String name;
    double price;

    public String getName(){
        return name;
    }
    public abstract double getPrice();
}
