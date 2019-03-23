package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class WiekPsa {
    public static void main(String[] args) {
        int lat=wiek();
        lata(lat);

    }
    public static int wiek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek psa:");
        int a = scanner.nextInt();
        return a;
    }
    public static void lata(int psielata){
        int q=0;
        if(psielata>=1){
            q=16;
            if(psielata>=2){
                q=q+4;
                if(psielata>2){
                    q=q+(psielata-2)*6;
                }
            }
        }else {
            System.out.println("Pies jest za młody");
        }
        System.out.println("Twój pies ma "+q+" w psich latach");
    }

}
