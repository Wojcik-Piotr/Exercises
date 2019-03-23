package pl.sdacademy.beginner.exceptions;

import com.sda.diamonds.MyArrayList;

import java.io.FileNotFoundException;

public class ExceptionMain {

    private static final int userData = 100;

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("podaj index");
                System.out.println(new MyArrayList<>().get(userData));
                break;
            } catch (OutOfRangeInList e) {
                System.out.printf("Podales zly index. sprobuj ponownie. Wiadomosc: " + e.getMessage());
            }
        }
    }

    public void start(){
        try{
            some();
        }catch (WordFileNotFoundException e) {
            System.out.println("nie znalazlem pliku word");
        } finally {

        }
    }
    public void some() {
        try {
            readWordFile();
        } catch (FileNotFoundException e) {
            throw new WordFileNotFoundException();
        }
    }

    public void readWordFile() throws FileNotFoundException {
    }

    public void readPropertiesFile() throws FileNotFoundException {
    }
    class WordFileNotFoundException extends  RuntimeException {
    }
}
