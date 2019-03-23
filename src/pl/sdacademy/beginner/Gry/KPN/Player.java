package pl.sdacademy.beginner.Gry.KPN;

import javax.tools.Tool;
import java.util.Random;
import java.util.Scanner;

public abstract class Player implements Tool, Logic {
    protected Player() {
    }

    static String movePl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz: K-Kamien, N-Nozyce, P-Paper");
        boolean x = false;
        while (!x) {
            String txt = scanner.nextLine();
            if (txt.equals("K") || txt.equals("k")) {
                System.out.println("Wybrałeś Kamień");
                x = true;
                return txt;
            } else if (txt.equals("N") || txt.equals("n")) {
                System.out.println("Wybrałeł Nożyce");
                x = true;
                return txt;
            } else if (txt.equals("P") || txt.equals("p")) {
                System.out.println("Wybrałeł Papier");
                x = true;
                return txt;
            } else {
                System.out.println("Podano błędny znak! Wybierz: K/N/P");
            }
        }
        return null;
    }

    static String moveEng() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose: R-Rock, S-Scissors, P-Paper");
        boolean x = false;
        while (!x) {
            String txt = scanner.nextLine();
            if (txt.equals("R") || txt.equals("r")) {
                System.out.println("You choose Rock");
                x = true;
                return txt;
            } else if (txt.equals("S") || txt.equals("s")) {
                System.out.println("You choose Scissors");
                x = true;
                return txt;
            } else if (txt.equals("P") || txt.equals("p")) {
                System.out.println("You choose Paper");
                x = true;
                return txt;
            } else {
                System.out.println("Invalid character provided! Choose: R/S/P");
            }
        }
        return null;
    }
    static String aiPl(){
        Random random=new Random();
        int ruch=random.nextInt(3);
            if (ruch==0){
                System.out.println("Został wybrałeś Kamień");
                return "K";
            }else if (ruch==1){
                System.out.println("Został wybrałeł Nożyce");
                return "S";
            }else{
                System.out.println("Został wybrałeł Papier");
            }
        return "P";
    }
    static String aiEng(){
        Random random=new Random();
        int ruch=random.nextInt(3);
        if (ruch==0){
            System.out.println("You choose Rock");
            return "R";
        }else if (ruch==1){
            System.out.println("You choose Scissors");
            return "S";
        }else{
            System.out.println("You choose Paper");
        }
        return "P";
    }
}
