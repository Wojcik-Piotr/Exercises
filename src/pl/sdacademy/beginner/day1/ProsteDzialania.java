package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class ProsteDzialania {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania:");
        char c= scanner.nextLine().charAt(0);
        int d;

        if (c=='+'){
            d = a + b;
        }else if(c=='-'){
            d = a - b;
        }else if(c=='*'){
            d = a * b;
        }else if(c=='/'){
            d = a / b;
        }else if(c=='%'){
            d =a % b;
        }else {
            System.out.println("Podano zły znak.");
            d=0;
        }
        System.out.println("wynik to "+ d );

    }
}
