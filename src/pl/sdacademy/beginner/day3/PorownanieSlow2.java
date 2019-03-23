package pl.sdacademy.beginner.day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PorownanieSlow2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String slowo1 = slowo();
        String slowo2 = slowo();

        System.out.println(porownanie(slowo1, slowo2));
    }

    private static String slowo() {
        System.out.println("Podaj słowo: ");
        String s = scanner.nextLine();
        return s;
    }

    private static boolean porownanie(String s1, String s2) {
        Pattern pattern = Pattern.compile(s2);
        Matcher matcher = pattern.matcher(s1);
        boolean z = matcher.find();
        return z;
        //   if (s1.length()<s2.length()){
        //       return false;
        //   }
        //   for (int i=0; i<s1.length()-s2.length()+1; i++){
        //       String substring=s1.substring(i, i+s2.length());
        //       if (substring.equals(s2)){
        //           return true;
        //        }
        //   }
        //   return false;

    }
}
