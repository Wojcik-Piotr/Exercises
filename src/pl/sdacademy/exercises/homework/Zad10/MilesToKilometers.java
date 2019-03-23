package pl.sdacademy.exercises.homework.Zad10;

public class MilesToKilometers {
    private double miles = 100d;
    private final double KILOMETERS_PER_MILE = 1.609d;
    private double kilometers;

    public void calculate() {
        kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
    }
}
