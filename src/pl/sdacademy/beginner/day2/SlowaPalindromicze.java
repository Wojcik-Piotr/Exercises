package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class SlowaPalindromicze {
    public static void main(String[] args) {
        System.out.println("Twoje słowo jest palindromem: "+symetria(slowo()));
    }
    public static String slowo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo:");
        String a = scanner.nextLine();
        return a;
    }
    public static boolean symetria(String a){
        boolean x;
        String b="";
        for(int i=a.length()-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        if (a.equals(b)){
            x=true;
        }else {
            x=false;
        }
        return x;
    }
}
//  for(int i=0; i<a.lenght()/2; i++){
//      int drugiIndex=a.lengch()-i-0;
//      if(a.charAt(i)!=a.charAt(drugiIndex)){
//          return false;
//      }
//  }
//  rerurn true;
//