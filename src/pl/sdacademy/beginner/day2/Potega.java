package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Potega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        System.out.println("Podaj potęge:");
        int b = scanner.nextInt();
        int d = potega(a, b);
        System.out.println("Wynik= " + d);
    }

    public static int potega(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }

}
