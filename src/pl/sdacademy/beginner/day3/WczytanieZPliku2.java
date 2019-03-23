package pl.sdacademy.beginner.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WczytanieZPliku2 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("text= "+load(plik()));
    }
    private static String plik(){
        System.out.println("Podaj nazwe pliku: ");
        String x=scanner.nextLine();
        return x;
    }
    public static String load(String plik) throws IOException{
        Scanner scanner = new Scanner(new File(plik));
        StringBuilder text=new StringBuilder();
        StringBuilder text1=new StringBuilder();
        StringBuilder text2=new StringBuilder();
        int i=1;
        while (scanner.hasNextLine()){
            String wiersz=scanner.nextLine();
            if (i%2==0){
                text1.append(wiersz).append("\n");
                i++;
            }else {
                text2.append(wiersz).append("\n");
                i++;
            }
            text.append(wiersz).append("\n");
        }
        zapisz("odd.txt",text1.toString());
        zapisz("even.txt",text2.toString());
        return text.toString();
    }
    public static void zapisz(String nazwa, String text) throws IOException{
        FileWriter fileWriter = new FileWriter(nazwa);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
        fileWriter.close();
    }
}
