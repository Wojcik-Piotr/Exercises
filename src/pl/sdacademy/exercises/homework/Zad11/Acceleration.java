package pl.sdacademy.exercises.homework.Zad11;

import java.util.Scanner;

public class Acceleration {
    private Scanner scanner = new Scanner(System.in);
    private double v0;
    private double v1;
    private double t;

    public Acceleration() {
        setV0();
        setV1();
        setT();
        averageAcceleration();
    }

    private void setV0() {
        System.out.println("Podaj prędość startową w m/s:");
        this.v0 = scanner.nextDouble();
    }

    private void setV1() {
        System.out.println("Podaj prędość końcową w m/s:");
        this.v1 = scanner.nextDouble();
    }

    private void setT() {
        System.out.println("Podaj czas w s:");
        this.t = scanner.nextDouble();
    }

    private void averageAcceleration() {
        double aa = (v1 - v0) / t;
        System.out.println("Przeciętne przyśpieszenie wynosi: " + aa + " m/s'");
    }

}
