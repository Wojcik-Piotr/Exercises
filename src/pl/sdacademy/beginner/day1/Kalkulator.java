package pl.sdacademy.beginner.day1;

import java.util.Scanner;

public class Kalkulator {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[2]);
        System.out.println("Podaj znak działania:");
        char c= scanner.nextLine().charAt(0);

        if (c=='+'){
            dodawanie(a,b);
        }else if(c=='-'){
            odejmowanie(a,b);
        }else if(c=='*'){
            iloczyn(a,b);
        }else if(c=='/'){
            iloraz(a,b);
        }else if(c=='%'){
            procent(a,b);
        }else {
            System.out.println("Podano zły znak.");
        }
    }
    public static void dodawanie(int c, int d){
        int x=c+d;
        System.out.println("wynik to "+ x);
    }
    public static void odejmowanie(int c, int d){
        int x=c-d;
        System.out.println("wynik to "+ x);
    }
    public static void iloczyn(int c, int d){
        int x=c*d;
        System.out.println("wynik to "+ x);
    }
    public static void iloraz(int c, int d){
        int x=c/d;
        System.out.println("wynik to "+ x);
    }
    public static void procent(int c, int d){
        int x=c%d;
        System.out.println("wynik to "+ x);
    }
}
