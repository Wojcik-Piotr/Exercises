package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class TabelaLustro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb:");
        int a = scanner.nextInt();
        int d=2*a;
        int[] tab=new int[d];
        int b=0;
        int c=tab.length;
        c=c-1;


        for (int i=0; i<a; i++){
            b=i+1;
            System.out.println("Podaj "+b+" liczbe");
            tab[i]=scanner.nextInt();
        }
        for(int p=0; p<a; p++) {
            tab[c]=tab[p];
            c--;
        }
        for(int x=0; x<d; x++){
            System.out.println(tab[x]);
        }
    }
}
