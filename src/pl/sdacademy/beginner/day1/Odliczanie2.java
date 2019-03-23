package pl.sdacademy.beginner.day1;

public class Odliczanie2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b=1;
        int i=a;
        while (i>=0) {
            System.out.println(i);
            b=i;
            i--;
        }
        if (b==0) {
            System.out.println("BOOM!!!");
        }
    }
}
