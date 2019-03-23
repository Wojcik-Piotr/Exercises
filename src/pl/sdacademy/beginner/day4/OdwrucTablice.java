package pl.sdacademy.beginner.day4;

import java.util.Scanner;

public class OdwrucTablice {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(odwruc(slowo()));
    }

    private static String slowo() {
        System.out.println("Podaj zdanie: ");
        String a = scanner.nextLine();
        return a;
    }
    private static String odwruc(String a){
        int dlugosc=a.length();
        String z="";
        for (int i=dlugosc-1; i>=0; i--){
            z+=a.charAt(i);
        }
        return z;
    }
}
