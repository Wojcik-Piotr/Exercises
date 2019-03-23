package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public class Milk extends ComponentsDecorator {
    Drink drink;
    Milk(Drink drink){
        this.drink=drink;
    }
    @Override
    public String getName() {
        return drink.getName()+" milk";
    }

    @Override
    public double getPrice() {
        return drink.price+0.5;
    }
}
