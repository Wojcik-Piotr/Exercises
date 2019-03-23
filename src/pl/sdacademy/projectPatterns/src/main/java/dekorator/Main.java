package pl.sdacademy.projectPatterns.src.main.java.dekorator;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Milk milk= new Milk(espresso);
        Chocolate chocolate=new Chocolate(milk);
        System.out.println(chocolate.getName());
    }
}
