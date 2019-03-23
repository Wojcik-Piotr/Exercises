package pl.sdacademy.beginner.day10;

import java.util.Scanner;

public class Nwd {
    private static Scanner scanner = new Scanner(System.in);
    private static int score;

    private static int calculate(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                score = i;
            }
        }
        return score;
    }

    private static int setNumber() {
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(calculate(setNumber(), setNumber()));
    }
}
