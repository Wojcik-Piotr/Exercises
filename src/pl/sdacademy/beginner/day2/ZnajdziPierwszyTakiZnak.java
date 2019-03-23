package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class ZnajdziPierwszyTakiZnak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak:");
        char a = scanner.nextLine().charAt(0);
        System.out.println("Podaj słowo:");
        String b = scanner.nextLine();
        System.out.println("index= "+element(a, b));
    }
    public static int element(char c, String d){
        int index=0;
        int wielkasc=d.length();
        for (int i=wielkasc-1; i>=0; i--){
            if(c==d.charAt(i)){
                index=i;
            }
        }
        return index;
    }
}
