package pl.sdacademy.beginner.day4;

import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczby {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        zagadka();
    }

    private static int liczba() {
        System.out.println("Podaj liczba: ");
        int x = scanner.nextInt();
        return x;
    }

    private static void zagadka() {
        int losowa = new Random().nextInt(1000);
        boolean q = false;
        System.out.println("Odgadnij liczbe od 0-1000");
        while (!q) {
            int a = liczba();
            if (losowa == a) {
                System.out.println("Gratulacje, masz racje!!!");
                q = true;
            } else if (losowa > a) {
                System.out.println("Podana liczba jest za mała");
            } else if (losowa < a) {
                System.out.println("Podana liczba jest za duza");
            } else {
                System.out.println("Podano błędną liczbe.");
            }
        }
    }
}

