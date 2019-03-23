package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class PoleKola {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("pole koła to " + kolo(liczba()));
    }

    private static double liczba() {
        System.out.println("Podaj promień: ");
        double x = scanner.nextDouble();
        return x;
    }

    private static double kolo(double r) {
        double a = 2 * r * Math.PI;
        return a;
    }
}
