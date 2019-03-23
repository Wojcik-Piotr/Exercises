package pl.sdacademy.beginner.day7.Zad2;

public class Obliczenia implements Runnable {
    private double i;

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    protected double geti() {
        return i;
    }
}
