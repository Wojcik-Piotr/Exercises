package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public abstract class ComponentsDecorator extends Drink {


    public String getName(Drink drink) {
        return drink.getName()+" with";
    }

}
