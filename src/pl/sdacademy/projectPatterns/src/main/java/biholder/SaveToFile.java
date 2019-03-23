package pl.sdacademy.projectPatterns.src.main.java.biholder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveToFile implements Observer {

    @Override
    public void handleSubjectMessenge(int ranfomIntiger) throws IOException {
        FileWriter fileWriter = new FileWriter("Messenge.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(ranfomIntiger);
        printWriter.close();
        fileWriter.close();
    }
}
