package pl.sdacademy.projectPatterns.src.main.java.factoryMethot;

public class Triangle implements Shape {

    public String draw() {
        System.out.println("Draw triangle");
        return "This is triangle";
    }
}
