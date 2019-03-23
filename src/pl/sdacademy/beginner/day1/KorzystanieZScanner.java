package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class KorzystanieZScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String line = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int number = scanner.nextInt();

        System.out.println("Cześć "+line+ "! Masz "+number+" lat!");
    }
}
