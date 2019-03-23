package pl.sdacademy.beginner.day10;

import java.util.Scanner;

public class Potega {
    private static Scanner scanner = new Scanner(System.in);

    private static int calculate(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        return c % 10;
    }

    private static int setNumber() {
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(calculate(setNumber(), setNumber()));
    }
}
