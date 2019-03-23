package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class ProsteDzialania2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak działania:");
        char c= scanner.nextLine().charAt(0);
        int d;
        int e;

        if (c=='+'){
            e=1;
        }else if(c=='-'){
            e=2;
        }else if(c=='*'){
            e=3;
        }else if(c=='/'){
            e=4;
        }else if(c=='%'){
            e=5;
        }else {
            System.out.println("Podano zły znak.");
            e = 0;
        }

            switch (e) {
                case 1:
                    d = a + b;
                    break;
                case 2:
                    d = a - b;
                    break;
                case 3:
                    d = a * b;
                    break;
                case 4:
                    d = a / b;
                    break;
                case 5:
                    d = a % b;
                    break;
                default:
                    System.out.println("ERROR");
                    d = 0;
            }
            System.out.println("wynik to " + d);
    }
}
