package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class CiągFibonacciego {
    public static void main(String[] args) {
        System.out.println("Wartość ciągu Fibonacciego to: "+fib(liczba()));
    }
    public static int liczba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        return a;
    }
    public static int fib(int a){
        int[] tab= new int[a+1];
        tab[0]=0;
        tab[1]=1;
        for (int i=2; i<=a; i++){
            tab[i]=tab[i-1]+tab[i-2];
        }
        return tab[a];
    }
}
