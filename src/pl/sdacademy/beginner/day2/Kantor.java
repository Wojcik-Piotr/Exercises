package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Kantor {
    public static void main(String[] args) {
        System.out.println("Kwota w Euro= "+euro(pln()));
    }
    public static double pln(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote w PLN:");
        double a = scanner.nextDouble();
        return a;
    }
    public static double euro(double a){
        a=a*4.28d;
        return a;
    }
}
