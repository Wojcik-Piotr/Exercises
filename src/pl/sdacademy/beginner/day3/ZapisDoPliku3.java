package pl.sdacademy.beginner.day3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisDoPliku3 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        zapisz(plik(),text());
    }
    private static String plik(){
        System.out.println("Podaj nazwe pliku: ");
        String x=scanner.nextLine();
        return x;
    }
    private static String text(){
        System.out.println("Podaj treść: ");
        String x=scanner.nextLine();
        return x;
    }
    public static void zapisz(String nazwa, String text) throws IOException{
        try( FileWriter fileWriter = new FileWriter(nazwa)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
            printWriter.close();
            fileWriter.close();
        }
    }
}
