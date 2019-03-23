package pl.sdacademy.beginner.day1;

public class Odliczanie {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b=1;
        for (int i=a; i>=0; i--) {
            System.out.println(i);
            b=i;
        }
        if (b==0) {
            System.out.println("BOOM!!!");
        }
    }
}
