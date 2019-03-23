package pl.sdacademy.projectPatterns.src.main.java.factoryMethot;

public class Circle implements Shape{
    public String draw() {
        System.out.println("Draw circle");
        return "This is circle";
    }
}
