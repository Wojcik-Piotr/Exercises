package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
            int liczba=liczba();
            System.out.println("Wynik silni=  "+silnia(liczba));
    }
    public static int liczba(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe:");
            int a = scanner.nextInt();
            return a;
    }
    public static int silnia(int b){
        int c=1;
        for (int i=b; i>=1; i++){
            c=c*i;
        }
        return c;
    }
}
