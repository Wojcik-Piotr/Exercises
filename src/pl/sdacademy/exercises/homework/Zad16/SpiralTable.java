package pl.sdacademy.exercises.homework.Zad16;

import java.util.Scanner;

public class SpiralTable {
    private Scanner scanner = new Scanner(System.in);

    public SpiralTable() {
        MyTable table = new MyTable(setWight(), setHeight());
        table.setTable(Spiral.selectGenerete(table.getTable(), clockwais(), grow()));
        table.printTable();
    }

    private boolean getBoolean() {
        String string = scanner.next();
        return string.equals("Y") || string.equals("y");
    }

    private int setHeight() {
        System.out.println("Enter height: ");
        return getNumber();
    }

    private boolean clockwais() {
        System.out.println("As clockwais? Y/N");
        return getBoolean();
    }

    private boolean grow() {
        System.out.println("grow? Y/N");
        return getBoolean();
    }

    private int setWight() {
        System.out.println("Enter wight: ");
        return getNumber();
    }

    private int getNumber() {
        int number = scanner.nextInt();
        return number;
    }


}
