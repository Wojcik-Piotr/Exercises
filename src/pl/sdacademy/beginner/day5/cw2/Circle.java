package pl.sdacademy.beginner.day5.cw2;

import java.util.Scanner;

public class Circle extends Shape{
    private Scanner scanner=new Scanner(System.in);
    public Circle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double premiter() {
        return 0;
    }

    private int r;

    private void getR(){
        this.r=scanner.nextInt();
    }
    private void obwud(int r){
        System.out.println(2*r*Math.PI);
    }
    private void pole(int r){
        System.out.println(r*r*Math.PI);
    }
}
