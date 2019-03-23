package pl.sdacademy.beginner.day6.zad1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad1 {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<String> hashSet = new HashSet<>();
    private static int count = 0;

    public static void main(String[] args) {
        txt();
    }

    private static void txt() {
        boolean petla = false;
        do {
            System.out.println("Podaj text: ");
            String txt = scanner.nextLine();
            if (txt.equalsIgnoreCase("exit")) {
                petla = true;
                System.out.println("Ilość wprowadzonych napisów: " + count);
                System.out.println("Rozmiar kolekcji: " + hashSet.size());
            } else {
                hashSet.add(txt);
                count++;
            }
        } while (!petla);
    }
}
