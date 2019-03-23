package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class Przypisywanie {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(roszada(imie(), nazwisko(), pseudo()));
    }

    private static String imie() {
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        return imie;
    }

    private static String nazwisko() {
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        return nazwisko;
    }

    private static String pseudo() {
        System.out.println("Podaj pseudonim: ");
        String pseudo = scanner.nextLine();
        return pseudo;
    }

    private static String roszada(String imie, String nazwisko, String pseudo) {
        StringBuilder sb = new StringBuilder();
        sb.append(imie).append(" ").append(pseudo).append(" ").append(nazwisko);
        return sb.toString();
    }

}
