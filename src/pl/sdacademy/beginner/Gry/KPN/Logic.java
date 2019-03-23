package pl.sdacademy.beginner.Gry.KPN;

import java.util.Scanner;

public interface Logic {
    Scanner scanner = new Scanner(System.in);

    static int ileGraczy() {
        System.out.println("Posaj ilość graczy: 0-2");
        int iloscGraczy = scanner.nextInt();
        boolean x = false;
        while (!x) {
            if (iloscGraczy == 0) {
                x = true;
                return 0;
            } else if (iloscGraczy == 1) {
                x = true;
                return 1;
            } else if (iloscGraczy == 2) {
                x = true;
                return 2;
            } else {
                System.out.println("Podano błędny znak! Wybierz: 0-2");
                iloscGraczy = scanner.nextInt();
            }
        }
        return 0;
    }

    static boolean setRestart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy zrestartoeać? T-Tak, N-Nie");
        boolean x = false;
        while (!x) {
            String txt = scanner.nextLine();
            if (txt.equals("T") || txt.equals("t")) {
                x = true;
                return false;
            } else if (txt.equals("N") || txt.equals("n")) {
                x = true;
                return true;
            } else {
                System.out.println("Podano nieprawidłowy znak! Wpisz: T/N");
            }
        }
        return false;

    }
}
