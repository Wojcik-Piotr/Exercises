package pl.sdacademy.beginner.day1;

public class TabelaString3 {
    public static void main(String[] args) {
        int a=args.length;
        String[] tab=new String[a];

        for(int i=0; i<a; i++) {
            System.out.println(args[i]);
        }
        int b=a-1;

        for(int i=0; i<a; i++){
            tab[i]=args[b];
            b--;
        }
        for(int i=0; i<a; i++){
            System.out.println(tab[i]);
        }
    }
}
