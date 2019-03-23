package pl.sdacademy.exercises.homework.Zad9;

import java.util.Random;
import java.util.Scanner;

public class WalkingSpace {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int side;
    private int counter = 0;

    public WalkingSpace() {
        this.side = setSide();
    }

    private int setSide() {
        System.out.println("podaj wymiar boku :");
        int side = scanner.nextInt();
        if (side < 10 || side > 100) {
            System.out.println("podaj liczbe w przedziale [10,100]");
            setSide();
        }
        return side;
    }

    public void run() {
        boolean[][] playTable = setTable();
        Walker walker = new Walker();
        setStartPoint(walker);
        while (!stop(playTable)) {
            counter++;
            if (!playTable[walker.getX()][walker.getY()]) {
                playTable[walker.getX()][walker.getY()] = true;
            }
            move(walker);
        }
        System.out.println(counter);
    }

    private boolean stop(boolean[][] table) {
        boolean stop = true;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (!table[i][j]) {
                    stop = false;
                    break;
                }
            }
        }
        return stop;
    }

    private boolean[][] setTable() {
        boolean[][] table = new boolean[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                table[i][j] = false;
            }
        }
        return table;
    }

    private void setStartPoint(Walker walker) {
        int x = random.nextInt(side - 1);
        int y = random.nextInt(side - 1);
        walker.setX(x);
        walker.setY(y);
    }

    private void move(Walker walker) {
        int direction = random.nextInt() % 4;
        if (direction == 0) {
            walker.moveNorth();
        } else if (direction == 1) {
            walker.moveEast();
        } else if (direction == 2) {
            walker.moveSouth();
        } else if (direction == 3) {
            walker.moveWest();
        }
        if (inTable(walker)) {
            setStartPoint(walker);
        }
    }

    private boolean inTable(Walker walker) {
        return walker.getX() < 0 || walker.getX() == side || walker.getY() < 0 || walker.getY() == side;
    }
}
