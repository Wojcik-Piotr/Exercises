package pl.sdacademy.beginner.Gry.OiX;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public interface Save {
    /**
     * program zapisujący gre.
     * @author zajc.
     */
    Scanner input=new Scanner(System.in);
    static void zapis(String plik, char[][] tab, boolean computer) throws IOException {
        FileWriter fileWriter = new FileWriter(plik);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                printWriter.println(tab[i][j]);
            }
        }
        if (computer) {
            printWriter.println("true");
        } else {
            printWriter.println("false");
        }
        printWriter.close();
        fileWriter.close();
    }
    static boolean czyZapisac() {
        System.out.println(" t/n");
        String txt =input.nextLine();;
        boolean coorect = false;
        while (!coorect)

            if (txt.equalsIgnoreCase("t")) {
                coorect = true;
                return true;
            } else if (txt.equalsIgnoreCase("n")) {
                coorect = true;
                return false;
            } else {
                System.out.println("Wybrano zły znak! Wybierz: t/n");
                txt=input.nextLine();
            }
        return false;
    }
    static String plik() {
        System.out.println("Podaj nazwe pliku: ");
        String x = input.nextLine();
        return x;
    }
}
