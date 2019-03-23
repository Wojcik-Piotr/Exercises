package pl.sdacademy.beginner.day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WzorceSlow4 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(porownanie(slowo()));

    }
    private static String slowo() {
        System.out.println("Podaj słowo: ");
        String s = scanner.nextLine();
        return s;
    }

    private static boolean porownanie(String s1) {
        Pattern pattern = Pattern.compile("^[a-zA-z][ac][a-zA-Z][2-8]\\\\[A-Z][a-zA-Z]\\$$");
        Matcher matcher = pattern.matcher(s1);
        boolean z = matcher.find();
        return z;
    }
}
