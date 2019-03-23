package pl.sdacademy.beginner.day3;

import java.util.Scanner;

public class PorownanieSlow {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String slowo1=slowo();
        String slowo2=slowo();
        System.out.println(porownanie(slowo1,slowo2));
    }
    private static String slowo(){
        System.out.println("Podaj słowo: ");
        String s=scanner.nextLine();
        return s;
    }
    private static boolean porownanie(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }else{
            for (int i=0; i<s1.length(); i++){
                if (s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
