package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {
        System.out.println("Kwota nettk= "+vat(pln()));
    }
    public static double pln(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote w beutto:");
        double a = scanner.nextDouble();
        return a;
    }
    public static double vat(double a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprować wartość podadku od 0 do 0,5:");
        double b = scanner.nextDouble();
        if (0<=b){
            if(b<=0.5) {
                a =a - a * b;
            }
        }else{
            System.out.println("Podano złą wartość Vat!");
        }
        return a;
    }
}
