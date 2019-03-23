package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class IloscCyfr {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ilość cyfr w zdaniu: " + iloscCyfr(slowo()));
    }

    private static String slowo() {
        System.out.println("Podaj zdanie: ");
        String a = scanner.nextLine();
        return a;
    }

    private static int iloscCyfr(String a) {
        int ilosc = 0;
        for (int i = 0; i < a.length(); i++) {
            char q = a.charAt(i);
            if (q == '0' || q == '1' || q == '2' || q == '3' || q == '4' || q == '5' || q == '6' || q == '7' || q == '8' || q == '9') {
                ilosc++;
            }
        }
        return ilosc;
    }
}
