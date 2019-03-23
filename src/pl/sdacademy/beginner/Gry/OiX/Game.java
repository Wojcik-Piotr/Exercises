package pl.sdacademy.beginner.Gry.OiX;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Game {
    /**
     * Szablon gry.
     * @author zajc.
     */

    protected Game() {

    }
    protected static void createTable(){
        char[][] table=new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }
    protected static boolean iloscGraczy() {
        Scanner input=new Scanner(System.in);
        boolean correct = false;
        System.out.println("Podaj ilu bedzie graczy (1-2): ");
        while (!correct) {
            String coord = input.next();
            if (coord.length() != 1) {
                System.out.println("Nieprawidlowa ilosc (moze byc 1 lub 2)");
            } else if (coord.charAt(0) != '1' &&
                    coord.charAt(0) != '2') {
                System.out.println("Nieprawidlowy znak (moze byc 1 lub 2)");
            } else {
                if (coord.charAt(0) == '1') {
                    correct = true;
                    return true;
                } else {
                    correct = true;
                    return false;
                }
            }
        }
        return false;
    }

}
