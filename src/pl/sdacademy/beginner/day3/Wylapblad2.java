package pl.sdacademy.beginner.day3;

import java.util.Scanner;

public class Wylapblad2 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Twoja liczba to: "+convert(znaki()));
    }
    private static String znaki(){
        System.out.println("liczbe: ");
        String x=scanner.nextLine();
        return x;
    }
    private static int convert(String txt) throws IllegalAccessException {
        int x = 0;
        try {
            x = Integer.valueOf(txt);
            if (txt==null){
                throw new IllegalAccessException("String cannot be null");
            }
        }catch (NumberFormatException e) {
            return -1;
        }
        return x;
    }
}
