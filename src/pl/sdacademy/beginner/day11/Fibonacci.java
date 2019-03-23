package pl.sdacademy.beginner.day11;

import java.util.Scanner;

public class Fibonacci {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ciąg Fibonacciego: "+fib(number()));
    }

    private static int number() {
        System.out.println("Enter number:");
        int numer = scanner.nextInt();
        return numer;
    }

    private static int fib(int number) {
        int[] tab = new int[number + 1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i <= number; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[number];
    }
}

