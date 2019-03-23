package pl.sdacademy.beginner.Gry.Sudoku;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public interface SaveSudoku {

    static void save(String fileName, char[][] tab) throws IOException {
        FileWriter fileWriter = new FileWriter("save.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (tab[row][column] == ' ') {
                    printWriter.print("0");
                } else {
                    printWriter.print(tab[row][column]);
                }
            }
            System.out.println();
        }
        printWriter.close();
        fileWriter.close();
    }
}