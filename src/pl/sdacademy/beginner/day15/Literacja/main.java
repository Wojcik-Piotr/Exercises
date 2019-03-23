package pl.sdacademy.beginner.day15.Literacja;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RabbitsSimulate rabbitsSimulate=new RabbitsSimulate();
        rabbitsSimulate.simulate(setMale(), setFemale(), setLimit());
        System.out.println("Ilość królików: " + rabbitsSimulate.getRabbits());
        System.out.println("Zmarło " + rabbitsSimulate.getDeadRabbids() + " królików,");
        System.out.println("Rozmnarzały się " + rabbitsSimulate.getTime() + " miesięcy.");

    }

    private static int setMale() {
        System.out.println("Podaj ilość samców: ");
        return scanner.nextInt();
    }

    private static int setFemale() {
        System.out.println("Podaj ilość samic: ");
        return scanner.nextInt();
    }

    private static int setLimit() {
        System.out.println("Podaj ilość limit: ");
        return scanner.nextInt();
    }
}
