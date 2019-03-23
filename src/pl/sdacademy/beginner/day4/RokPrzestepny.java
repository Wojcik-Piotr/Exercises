package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class RokPrzestepny {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int liczba = liczba();
        System.out.println("Rok " + liczba + " jest przestępny: " + rok(liczba));
    }

    private static int liczba() {
        System.out.println("Podaj rok: ");
        int x = scanner.nextInt();
        return x;
    }

    private static boolean rok(int a) {
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}
