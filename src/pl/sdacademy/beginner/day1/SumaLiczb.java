package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb:");
        int a = scanner.nextInt();
        int[] tab=new int[a];
        int b=0;
        int c=0;

        for (int i=0; i<a; i++){
            b=i+1;
            System.out.println("Podaj "+b+" liczbe");
            tab[i]=scanner.nextInt();
        }

        for (int p=0; p<a; p++){
            c=c+tab[p];
        }
        System.out.println("Suma wszystkich liczb to "+c);
    }

}
