package pl.sdacademy.beginner.Gry.Sudoku;

public class SudokuSolver {
    private static int[][] userBoard =
            {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0}};
    private static int[][] board = new int[9][9];

    public static void main(String[] args) {
        double timeStart = System.currentTimeMillis();
        playerBoard();
        printBoard(board);
        printBoard(solve(0, 0, board));
        double timeEnd = System.currentTimeMillis();
        System.out.printf("That took: " + (timeEnd - timeStart) + " millis to complite");


    }

    private static void playerBoard() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                board[row][column] = userBoard[row][column];
            }
        }
    }


    private static int[][] solve(int row, int column, int[][] grid) {
        while (!validity(8, 8, grid) || grid[8][8] == 0) {
            if (userBoard[row][column] != 0) {
                int row1, column1;
                if (column == 8) {
                    row1 = row + 1;
                    column1 = 0;
                } else {
                    row1 = row;
                    column1 = column + 1;
                }
                solve(row1, column1, grid);
            } else {
                if (grid[row][column] < 9) {
                    grid[row][column]++;
                    if (validity(row, column, grid)) {
                        int row1, column1;
                        if (column == 8) {
                            row1 = row + 1;
                            column1 = 0;
                        } else {
                            row1 = row;
                            column1 = column + 1;
                        }
                        solve(row1, column1, grid);
                    }
                } else {
                    grid[row][column] = 0;
                    break;
                }
            }
        }
        return grid;
    }

    private static boolean validity(int row, int column, int[][] grid) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            temp.append(Integer.toString(grid[row][i]));
            temp.append(Integer.toString(grid[i][column]));
            temp.append(Integer.toString(grid[(row / 3) * 3 + i / 3][(column / 3) * 3 + i % 3]));
        }
        int count = 0, index = 0;
        while ((index = temp.indexOf(Integer.toString(grid[row][column]), index)) != -1) {
            index++;
            count++;
        }
        return count == 3;
    }

    private static void printBoard(int[][] grid) {
        System.out.println();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }
    }
}