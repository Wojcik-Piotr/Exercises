package pl.sdacademy.beginner.day3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisDoPliku2 {private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int x=ilosc();
        String[] tab=new String[x+1];
        tab=text(x, tab);
        pytanie(czyZapisac(), tab);

    }
    private static String[] text(int a, String[] tab) {
        for (int i = 0; i <= a; i++) {
            tab[i] = zdania();
        }
        return tab;
    }
    private static char czyZapisac(){
        System.out.println("Czy zapisać? t/n");
        char x=scanner.nextLine().charAt(0);
        return x;
    }
    private static void pytanie(char x, String[] tab) throws IOException{
        boolean ok=false;
        while (!ok) {
            if (x == 't') {
                ok=true;
                zapisz(plik(),tab);
            }else if (x=='n'){
                ok=true;
            }else {
                System.out.println("Podano zły znak!");
            }
        }
    }
    private static String plik(){
        System.out.println("Podaj nazwe pliku: ");
        String x=scanner.nextLine();
        return x;
    }
    private static int ilosc(){
        System.out.println("Podaj ilość wierszy: ");
        int x=scanner.nextInt();
        return x;
    }
    private static String zdania(){
        System.out.println("Podaj linie textu: ");
        String x=scanner.nextLine();
        return x;
    }
    public static void zapisz(String nazwa, String[] text) throws IOException{
        FileWriter fileWriter = new FileWriter(nazwa);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i=0; i<text.length; i++) {
            printWriter.println(text[i]);
        }
        printWriter.close();
        fileWriter.close();
    }
}
