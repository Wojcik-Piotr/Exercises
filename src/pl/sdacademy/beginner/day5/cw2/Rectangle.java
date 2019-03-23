package pl.sdacademy.beginner.day5.cw2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(String color, double a, double b){
        super(color);
        this.a=a;
        this.b=b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double premiter() {
        return 2*a*2*b;
    }
}
