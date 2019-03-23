package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class SumaLiczb {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wynik= " + suma(liczba()));
    }

    private static int liczba() {
        System.out.println("Podaj liczbe: ");
        int x = scanner.nextInt();
        return x;
    }

    private static int suma(int a) {
        int b = 0;
        for (int i = 0; i <= a; i++) {
            b += i;
        }
        return b;
    }
}
