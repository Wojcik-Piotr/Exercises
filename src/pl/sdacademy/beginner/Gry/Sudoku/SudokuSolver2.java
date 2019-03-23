package pl.sdacademy.beginner.Gry.Sudoku;

import java.util.stream.IntStream;

public class SudokuSolver2 {
    private static SudokuGenerator sudokuGenerator = new SudokuGenerator(9, 25);
    private static int[][] board = new int[9][9];

    public static void main(String[] args) {
        double timeStart = System.currentTimeMillis();
        playerBoaed();
        printBoard();
        if (solve(board)) {
            System.out.println("Sudoku Solution: ");
            printBoard();
        } else {
            System.out.println("Sudoku Unsolvable");
        }
        double timeEnd = System.currentTimeMillis();
        System.out.printf("That took: " + (timeEnd - timeStart) + " millis to complite");

    }

    private static void playerBoaed() {
        sudokuGenerator.fillValues();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                board[row][column] = sudokuGenerator.getMat()[row][column];
            }
        }
    }

    private static boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == 0) {
                    for (int number = 1; number <= 9; number++) {
                        board[row][column] = number;
                        if (isValid(board, row, column) && solve(board)) {
                            return true;
                        }
                        board[row][column] = 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int column) {
        return (rowConstraint(board, row) && columnConstraint(board, column) && subsectionConstraint(board, row, column));
    }

    private static boolean rowConstraint(int[][] board, int row) {
        boolean[] constraint = new boolean[9];
        return IntStream.range(0, 9).allMatch(column -> checkConstraint(board, row, constraint, column));
    }

    private static boolean columnConstraint(int[][] board, int column) {
        boolean[] constraint = new boolean[9];
        return IntStream.range(0, 9).allMatch(row -> checkConstraint(board, row, constraint, column));
    }

    private static boolean subsectionConstraint(int[][] board, int row, int column) {
        boolean[] constraint = new boolean[9];
        int subsectionRowStart = (row / 3) * 3;
        int subsectionRowEnd = subsectionRowStart + 3;

        int subsectionColumnStart = (column / 3) * 3;
        int subsectionColumnEnd = subsectionColumnStart + 3;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checkConstraint(board, r, constraint, c)) return false;
            }
        }
        return true;
    }

    static boolean checkConstraint(int[][] board, int row, boolean[] constraint, int column) {
        if (board[row][column] != 0) {
            if (!constraint[board[row][column] - 1]) {
                constraint[board[row][column] - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}
