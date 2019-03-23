package pl.sdacademy.beginner.day3;

import java.util.Scanner;

public class Zdanie {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(słowo(liczba()));
    }
    private static int liczba(){
        System.out.println("Podaj ilość słów: ");
        int a=scanner.nextInt();
        return a;
    }
    private static String słowo(int s){
        System.out.println("Podaj słowo: ");
        String z="";
        for (int i=0;i<=s; i++){
            String a=scanner.nextLine();
            z+=a+" ";
        }
        return z;
    }
}
