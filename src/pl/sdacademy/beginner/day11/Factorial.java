package pl.sdacademy.beginner.day11;

import java.util.Scanner;

public class Factorial {
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
        int fac=1;
        for (int i=1; i<=number;i++){
            fac*=i;
        }
        return fac;
    }
}
