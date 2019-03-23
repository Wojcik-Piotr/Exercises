package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class CzyParzysta {
    public static void main(String[] args) {
        int liczba=liczba();
        System.out.println("Liczba jest parzysta: "+parzysta(liczba));
    }
    public static int liczba(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        return a;
    }
    public static boolean parzysta(int b){
        boolean w;
        if(b%2==0){
            w=true;
        }else {
            w=false;
        }
        return w;
    }
}
