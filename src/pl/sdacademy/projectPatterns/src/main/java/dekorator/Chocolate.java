package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public class Chocolate extends ComponentsDecorator {
    Drink drink;

    Chocolate (Drink drink){
        this.drink=drink;
    }

    @Override
    public String getName() {
        return drink.getName()+" chocolate";
    }

    @Override
    public double getPrice() {
        return drink.price+0.7;
    }
}
