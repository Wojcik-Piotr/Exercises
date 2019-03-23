package pl.sdacademy.beginner.day5.cw2;

public abstract class Shape {
    protected String color;

    public String getColor(){
        return color;
    }
    public Shape(String color){
        this.color=color;
    }
    public abstract double area();

    public abstract double premiter();
}
