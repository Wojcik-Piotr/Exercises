package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class ZamianaWTablicy {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] tab={1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {
        tab=zamiana(liczba(),liczba(),tab);
        for (int i=0; i<tab.length; i++){
            System.out.print(tab[i]+", ");
        }
    }
    private static int liczba() {
        System.out.println("Podaj liczbe: ");
        int x = scanner.nextInt();
        return x;
    }
    private static int[] zamiana(int a, int b, int[] tab){
        int x=tab[a];
        tab[a]=tab[b];
        tab[b]=x;
        return tab;
    }

}
