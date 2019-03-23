package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class TabelaWielowymiarowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wierszy:");
        int a = scanner.nextInt();
        System.out.println("Podaj ilość kolumn:");
        int b = scanner.nextInt();
        int[][] tab=new int[a][b];

        for(int i=0; i<a; i++){
            for (int p=0; p<b; p++){
                tab[i][p]=i+p+2;
            }
        }
        for(int i=0; i<a; i++){
            for (int p=0; p<b; p++){
                System.out.print(tab[i][p]+" ");
            }
            System.out.println();
        }
    }
}
