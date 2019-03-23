package pl.sdacademy.beginner.day10.Pp0506a;

public class Point {
    private String name;
    private double x;
    private double y;

    public Point(String name, double x, double y){
        this.name=name;
        this.x=x;
        this.y=y;
    }

    protected String getName() {
        return name;
    }

    protected double getX() {
        return x;
    }

    protected double getY() {
        return y;
    }

}
