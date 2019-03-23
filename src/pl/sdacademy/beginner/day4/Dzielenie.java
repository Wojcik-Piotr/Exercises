package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class Dzielenie {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wynik dzielenia= " + div(liczba(), liczba()));
    }

    private static int liczba() {
        System.out.println("Podaj liczbe: ");
        int x = scanner.nextInt();
        return x;
    }

    private static int div(int a, int b) {
        int i = 0;
        while (a >= b) {
            a -= b;
            i++;
        }
        return i;
    }
}
