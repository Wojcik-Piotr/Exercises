package pl.sdacademy.beginner.day1;

import java.sql.SQLOutput;

public class FormatLiczb {
    public static void main(String[] args) {
        int a=1;
        long b=2L;
        float c=1.5f;
        char niewiadoma='a';
        String text=" jest równe ";

        System.out.println("("+a+"+"+b+")"+"*"+c+"="+niewiadoma);
        System.out.println(niewiadoma+text+(a+b)*c);
    }
}
