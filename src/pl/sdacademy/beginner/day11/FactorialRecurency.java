package pl.sdacademy.beginner.day11;

import java.util.Scanner;

public class FactorialRecurency {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Factorial: "+factorial(setNymber()));
    }
    private static int setNymber(){
        System.out.println("Enter number: ");
        int number= scanner.nextInt();
        return number;
    }
    private static int factorial(int number){
        if (number>0){
            return number*factorial(number-1);
        }else {
            return 1;
        }
    }
}
