package pl.sdacademy.beginner.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Szukacz {
    public static void main(String[] args) {
        int a=0;
        int[] c=new int[2];
        boolean d=szukacz(a, c);


    }
    public static boolean szukacz(int liczba, int[] lista){
        boolean logik=false;
        for(int i=0; i<lista.length; i++){
            if (lista[i]==liczba){
                logik=true;
            }
        }
        return logik;

    }
}
