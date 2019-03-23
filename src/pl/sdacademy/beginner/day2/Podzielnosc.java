package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Podzielnosc {
    public static void main(String[] args) {
        dzelenie(liczba());


    }
    public static int liczba(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        return a;
    }
    public static void dzelenie(int b){
        boolean w;
        if(b%3==0){
            if(b%5==0){
                System.out.println("FizzBuzz");
            }else {
                System.out.println("Fizz");
            }
        }else if(b%5==0) {
            System.out.println("Buzz");
        }else {
            System.out.println("Liczba nie jest podzielna przez 3 ani przez 5");
        }
    }
}
