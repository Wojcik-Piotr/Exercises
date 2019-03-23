package pl.sdacademy.exercises.homework.Zad13;

import java.util.Scanner;

public class Point {
    private Scanner scanner=new Scanner(System.in);
    private int x;
    private int y;

    public Point(){
        setX();
        setY();
    }

     private void setX() {
        System.out.println("Poda współrzędną x: ");
        this.x = scanner.nextInt();
    }

    private void setY() {
        System.out.println("Poda współrzędną y: ");
        this.y = scanner.nextInt();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
