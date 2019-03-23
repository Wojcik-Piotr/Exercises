package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public class Tea extends Drink {
    protected double price=5;

    public Tea() {
        super.name="Tea";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
