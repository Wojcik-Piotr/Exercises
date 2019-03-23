package pl.sdacademy.beginner.day3;

import java.util.Scanner;

public class WylapBlad {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Twoja liczba to: "+convert(znaki()));
    }
    private static String znaki(){
        System.out.println("liczbe: ");
        String x=scanner.nextLine();
        return x;
    }
    private static int convert(String txt) {
        int x = 0;
        try {
            x = Integer.valueOf(txt);
        } catch (NullPointerException e) {
            return -1;
        }catch (NumberFormatException e) {
            return -2;
        }
        return x;
    }
}
