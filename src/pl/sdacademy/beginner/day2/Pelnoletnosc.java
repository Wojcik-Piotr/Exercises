package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Pelnoletnosc {
    public static void main(String[] args) {
        int wiek=wiek();
        System.out.println("Jesteś pełnoletni: "+pelnoletnosc(wiek));
    }
    public static int wiek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int a = scanner.nextInt();
        return a;
    }
    public static boolean pelnoletnosc(int b){
        boolean w;
        if(b>=18){
            w=true;
        }else {
            w=false;
        }
        return w;
    }
}
