package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class SyfrCezra {
    public static void main(String[] args) {
        System.out.println("Zaszyfrowana wiadomość: "+cezar(slowo(), liczba()));
    }
    public static String slowo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj haslo do zakodowania: ");
        String start=scanner.nextLine();
        return start;
    }
    public static int liczba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj moc kodu(1-26)");
        int a = scanner.nextInt();
        return a;
    }
    public static String cezar(String z, int x){
        StringBuilder sb=new StringBuilder(z);
        for(int i=0; i<z.length(); i++){
            int c=(int)z.charAt(i);
            if (c+x>122){
                c=32+(x-(122-c));
            }else {
                c+=x;
            }
            sb.setCharAt(i, (char)c);
        }
        return sb.toString();
    }
}
