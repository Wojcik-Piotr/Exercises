package pl.sdacademy.exercises.homework.Zad8;

import java.util.Random;
import java.util.Scanner;

public class MySaper {
    private Scanner scanner = new Scanner(System.in);
    private int side1;
    private int side2;
    private int probability;

    public MySaper() {
        this.side1 = setSide();
        this.side2 = setSide();
        this.probability = setProbability();
    }

    private int setSide() {
        System.out.println("podaj wymiar boku :");
        int side = scanner.nextInt();
        if (side < 3 || side > 10) {
            System.out.println("podaj liczbe w przedziale [3,10]");
            setSide();
        }
        return side;
    }

    private int setProbability() {
        System.out.println("podaj prawdopodobieństwo wystąpienia bomby w % :");
        int propability = scanner.nextInt();
        if (propability < 25 || propability > 72) {
            System.out.println("podaj liczbe w przedziale [25,75]");
            setProbability();
        }
        return propability;

    }

    public void generate() {
        boolean[][] table = new boolean[side2][side1];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = enter();
            }
        }
        printBombTable(table);
    }

    private boolean enter() {
        Random random = new Random();
        int i = random.nextInt(100);
        return i < probability;
    }

    private void printBombTable(boolean[][] table) {
        String s;
        System.out.print(line(table) + "\n");
        for (int i = 0; i < table.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j]) {
                    s = "T";
                } else {
                    s = "N";
                }
                System.out.print(s + " | ");
            }
            System.out.print("\n" + line(table) + "\n");
        }
        System.out.println();
        printresultTable(table);
    }

    private void printresultTable(boolean[][] table) {
        int[][] resultTable = resultTable(table);
        System.out.print(line(table) + "\n");
        for (int i = 0; i < table.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j]) {
                    System.out.print("* | ");
                } else {
                    System.out.print(resultTable[i][j] + " | ");
                }

            }
            System.out.print("\n" + line(table) + "\n");
        }
    }

    private int[][] resultTable(boolean[][] table) {
        int[][] zeroTable = new int[table.length][table[0].length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                zeroTable[i][j] = 0;

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j]) {
                    if (i > 0 && j > 0 && i < table.length - 1 && j < table[0].length - 1) {
                        for (int r = (-1); r < 2; r++) {
                            for (int k = (-1); k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == 0 && j > 0 && j < table[0].length - 1) {
                        for (int r = 0; r < 2; r++) {
                            for (int k = (-1); k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == table.length - 1 && j > 0 && j < table[0].length - 1) {
                        for (int r = (-1); r < 1; r++) {
                            for (int k = (-1); k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (j == 0 && i > 0 && i < table.length - 1) {
                        for (int r = (-1); r < 2; r++) {
                            for (int k = 0; k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (j == table[0].length - 1 && i > 0 && i < table.length - 1) {
                        for (int r = (-1); r < 2; r++) {
                            for (int k = (-1); k < 1; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == 0 && j == 0) {
                        for (int r = 0; r < 2; r++) {
                            for (int k = 0; k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == 0 && j == table[0].length - 1) {
                        for (int r = 0; r < 2; r++) {
                            for (int k = (-1); k < 1; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == table.length - 1 && j == 0) {
                        for (int r = (-1); r < 1; r++) {
                            for (int k = 0; k < 2; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    } else if (i == table.length - 1 && j == table[0].length - 1) {
                        for (int r = (-1); r < 1; r++) {
                            for (int k = (-1); k < 1; k++) {
                                zeroTable[i + r][j + k] += 1;
                            }
                        }
                    }
                }
            }
        }
        return zeroTable;
    }

    private String line(boolean[][] table) {
        String line = "";
        for (int j = 0; j < table[0].length; j++) {
            line += ("----");
        }
        return line;
    }

}
