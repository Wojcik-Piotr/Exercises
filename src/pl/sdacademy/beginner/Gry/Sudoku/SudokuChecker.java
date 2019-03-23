package pl.sdacademy.beginner.Gry.Sudoku;


public class SudokuChecker {

    protected static boolean sudokuVerifier(int[][] board) {
        return rowVerifier(board) && columnVerifier(board) && squareVerifier(board);
    }


    private static boolean rowVerifier(int[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        } else {
            for (int column = 0; column < 9; column++) {
                boolean[] verifier = new boolean[board.length];
                for (int row = 0; row < 9; row++) {
                    if (board[row][column] != 0) {
                        if (verifier[(board[row][column] - 1)]) {
                            System.out.println("Valid field: row: " + row + ", column: " + column);
                            return false;
                        } else {
                            (verifier[(board[row][column] - 1)]) = true;
                        }
                    }
                }
            }

        }
        return true;
    }

    private static boolean columnVerifier(int[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        } else {
            for (int row = 0; row < 9; row++) {
                boolean[] verifier = new boolean[board.length];
                for (int column = 0; column < 9; column++) {
                    if (board[row][column] != 0) {
                        if (verifier[(board[row][column] - 1)]) {
                            System.out.println("Valid field: row: " + row + ", column: " + column);
                            return false;
                        } else {
                            (verifier[(board[row][column] - 1)]) = true;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean squareVerifier(int[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        } else {
            for (int squaer = 0; squaer < 9; squaer++) {
                boolean[] verifier = new boolean[board.length];
                for (int row = squaer / 3 * 3; row < squaer / 3 * 3 + 3; row++) {
                    for (int column = squaer % 3 * 3; column < squaer % 3 * 3 + 3; column++) {
                        if (board[row][column] != 0) {
                            if (verifier[(board[row][column] - 1)]) {
                                System.out.println("Valid field: row: " + row + ", column: " + column);
                                return false;
                            } else {
                                (verifier[(board[row][column] - 1)]) = true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
