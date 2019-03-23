package pl.sdacademy.beginner.day5.cw2;

public class CirclePlus extends Shape{
    private int r;

    public CirclePlus(String color,int r) {
        super(color);
        this.r=r;
    }

    @Override
    public double area() {
        return (r*r*Math.PI);
    }

    @Override
    public double premiter() {
        return (2*r*Math.PI);
    }
}
