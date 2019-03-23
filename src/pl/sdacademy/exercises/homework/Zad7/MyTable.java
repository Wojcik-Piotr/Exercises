package pl.sdacademy.exercises.homework.Zad7;

import java.util.Scanner;

public class MyTable {
    private Scanner scanner = new Scanner(System.in);
    private int side;

    public MyTable() {
        this.side = setSide();
    }

    private int setSide() {
        System.out.println("podaj wymiar boku :");
        int side = scanner.nextInt();
        if (side < 1 || side > 10) {
            System.out.println("podaj liczbe w przedziale [1,10]");
            setSide();
        }
        return side;
    }

    public void generate() {
        int[][] table = new int[side][side];

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 && j == 0) {
                    table[0][0] = 1;
                } else if (i == 0) {
                    table[i][j] = enter(table[i][j - 1] + 1);
                } else {
                    table[i][j] = enter(table[i - 1][j] + 1);
                }
            }
        }
        print(table);
    }

    private int enter(int element) {
        if (element > 5) {
            return 1;
        } else {
            return element;
        }
    }

    private void print(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
