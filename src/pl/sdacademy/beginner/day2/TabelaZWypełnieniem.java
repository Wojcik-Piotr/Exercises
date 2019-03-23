package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class TabelaZWypełnieniem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe komurek:");
        int a = scanner.nextInt();
        System.out.println("Podaj wartość:");
        int b = scanner.nextInt();
        int[] tab=tablica(a, b);
        wydruk(a, tab);
    }
    public static int[] tablica(int a, int b){
        int[] tablica=new int[a];
        for(int i=0; i<a; i++){
            tablica[i]=b;
        }
        return tablica;
    }
    public static void wydruk(int a, int tablica[]){
        for(int i=0; i<a; i++){
            System.out.println(tablica[i]);
        }
    }
}
