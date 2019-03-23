package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Pierwsze {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] c = pierwsze(10000);
        czyPierwsza(liczba(),c);
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " = " + c[i] + ",");
        }

    }
    private static void czyPierwsza(int t, boolean[] c){
        for (int i = 0; i < t; i++) {
            int a = liczba();
            System.out.println(c[a]);
        }
    }

    public static int liczba() {

        //System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        return a;
    }

    public static boolean[] pierwsze(int max) {
        int liczbaIteracji = (int) Math.sqrt(max);
        boolean[] jestPierwsza = new boolean[max + 1];
        jestPierwsza[0]=false;
        jestPierwsza[1]=false;
        for (int i = 2; i < max + 1; i++) {
            jestPierwsza[i] = true;
        }
        for (int i = 2; i <= liczbaIteracji; i++) {
            if (jestPierwsza[i]) {
                for (int j = i * i; j <= max; j += i) {
                    jestPierwsza[j] = false;
                }
            }
        }
        for (int i = 2; i <= max; i++) {
            if (jestPierwsza[i]) {
//                System.out.println(i + " ");
            }
        }
        return jestPierwsza;
    }
}
