package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public class Espresso extends Drink {
    protected double price=10;

    public Espresso() {
        super.name="Espresso";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
