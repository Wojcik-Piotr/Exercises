package pl.sdacademy.beginner.day11;

import java.util.Scanner;

public class FibonacciRecurency {
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
        if (number >1) {
            return fib(number-1)+fib(number-2);
        }else if(number==1) {
            return 1;
        }else {
            return 0;
        }
    }
}
