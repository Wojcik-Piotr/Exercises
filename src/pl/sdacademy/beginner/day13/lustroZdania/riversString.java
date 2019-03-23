package pl.sdacademy.beginner.day13.lustroZdania;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

public class riversString {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        reverseString(getString());
    }

    private static String getString() {
        System.out.println("Napisz coś: ");
        String string = scanner.nextLine();
        return string;
    }

    private static void reverseString(String string) {
        string.toLowerCase();
        String[] tab = string.split(" ");
        char[] word=new char[tab[tab.length-1].length()];
        for (int i=0;i<word.length;i++){
            word[i]=tab[tab.length-1].charAt(i);
        }
        word[0]=(char)(word[0]-'a'+'A');
        tab[tab.length-1]="";
        for (int i=0; i<word.length; i++){
            tab[tab.length-1]+=word[i];
        }
        String rewers = "";
        for (int i = tab.length - 1; i >= 0; i--) {
            rewers += tab[i]+" ";
        }

        System.out.println(rewers);
    }
}
