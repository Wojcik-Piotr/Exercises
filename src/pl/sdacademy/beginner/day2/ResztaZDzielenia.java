package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class ResztaZDzielenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe 1.:");
        int a = scanner.nextInt();
        System.out.println("Podaj Liczbe 2.:");
        int b = scanner.nextInt();
        System.out.print(reszta(a, b));


    }
    public static int reszta(int a, int b){
        int wynik=a/b;
        if((wynik*b)==a){
            System.out.println("Reszta równa jest 0");
        }else{
            while (a>=b){
                a=a-b;
            }
        }
        return a;
    }
}
