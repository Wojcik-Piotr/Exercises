package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class TabliczkaMnozenia {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] b;

    public static void main(String[] args) {
        tabliczka(liczba());
    }

    private static int liczba() {
        System.out.println("Podaj liczbe: ");
        int x = scanner.nextInt();
        return x;
    }

    private static void tabliczka(int a) {
        b = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                b[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
