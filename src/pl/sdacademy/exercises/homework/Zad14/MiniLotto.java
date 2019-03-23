package pl.sdacademy.exercises.homework.Zad14;

import java.util.Random;
import java.util.Scanner;

public class MiniLotto {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private String playersNumber;
    private String gameNumer;

    public MiniLotto() {
        setPlayersNumber();
        generateNumer();
        result();
    }

    private void setPlayersNumber() {
        System.out.println("Wporowdz swoją liczbe: ");
        int number = scanner.nextInt();
        if (number > 9) {
            playersNumber = String.valueOf(number);
        } else {
            playersNumber = String.valueOf(0);
            playersNumber += String.valueOf(number);
        }
    }

    private void generateNumer() {
        int number = random.nextInt(100);
        if (number > 9) {
            gameNumer = String.valueOf(number);
        } else {
            gameNumer = String.valueOf(0);
            gameNumer += String.valueOf(number);
        }
    }

    private int avard() {
        boolean number1 = false;
        boolean number2 = false;
        if (playersNumber.charAt(0) == playersNumber.charAt(1)) {
            for (char c : gameNumer.toCharArray()) {
                if (c == playersNumber.charAt(0)) {
                    return 2;
                }
            }
        } else {
            for (char c : gameNumer.toCharArray()) {
                if (c == playersNumber.charAt(0)) {
                    number1 = true;
                }
                if (c == playersNumber.charAt(1)) {
                    number2 = true;
                }
            }
        }
        if (number1 && number2) {
            return 1;
        } else if (number1 || number2) {
            return 2;
        } else {
            return 0;
        }

    }

    private void result() {
        if (gameNumer.equals(playersNumber)) {
            System.out.println("Wygrałeś/Wygrałaś 10,000$");
        } else if (avard() == 1) {
            System.out.println("Wygrałeś/Wygrałaś 3,000$");
        } else if (avard() == 2) {
            System.out.println("Wygrałeś/Wygrałaś 1,000$");
        } else {
            System.out.println("Wygrałeś/Wygrałaś 0$");
        }
    }
}
