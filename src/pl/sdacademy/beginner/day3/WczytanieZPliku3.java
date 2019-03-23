package pl.sdacademy.beginner.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WczytanieZPliku3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("text= " + load(plik()));
    }

    private static String plik() {
        System.out.println("Podaj nazwe pliku: ");
        String x = scanner.nextLine();
        return x;
    }

    public static String load(String plik) throws IOException {
        try (Scanner scanner = new Scanner(new File(plik))) {
            StringBuilder text = new StringBuilder();
            while (scanner.hasNextLine()) {
                String wiersz = scanner.nextLine();
                text.append(wiersz).append("\n");
            }
            return text.toString();
        }
    }

    public static void zapisz(String nazwa, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(nazwa);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
        fileWriter.close();
    }
}
