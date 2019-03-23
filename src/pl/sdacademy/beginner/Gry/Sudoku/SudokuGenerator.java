package pl.sdacademy.beginner.Gry.Sudoku;

public class SudokuGenerator {

    private int[] mat[];
    private final int COLANDROW;
    private final int SRN;
    private final int MISSING;

    protected SudokuGenerator(int COLANDROW, int MISSING) {
        this.COLANDROW = COLANDROW;
        this.MISSING = MISSING;
        Double SRNd = Math.sqrt(COLANDROW);
        SRN = SRNd.intValue();
        mat = new int[COLANDROW][COLANDROW];
    }

    protected int[][] getMat() {
        return mat;
    }

    protected void fillValues() {
        fillDiagonal();
        fillRemaining(0, SRN);
        removeKDigits();
    }

    private void fillDiagonal() {
        for (int i = 0; i < COLANDROW; i = i + SRN) {
            fillBox(i, i);
        }
    }

    private boolean unUsedInBox(int rowStart, int colStart, int num) {
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                if (mat[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private void fillBox(int row, int col) {
        int num;
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                do {
                    num = randomGenerator(COLANDROW);
                }
                while (!unUsedInBox(row, col, num));
                mat[row + i][col + j] = num;
            }
        }
    }

    private int randomGenerator(int num) {
        return (int) Math.floor((Math.random() * num + 1));
    }

    private boolean CheckIfSafe(int row, int col, int num) {
        return (unUsedInRow(row, num) && unUsedInCol(col, num) && unUsedInBox(row - row % SRN, col - col % SRN, num));
    }

    private boolean unUsedInRow(int row, int num) {
        for (int col = 0; col < COLANDROW; col++) {
            if (mat[row][col] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean unUsedInCol(int col, int num) {
        for (int row = 0; row < COLANDROW; row++) {
            if (mat[row][col] == num) {
                return false;
            }
        }
        return true;
    }


    private boolean fillRemaining(int row, int col) {
        if (col >= COLANDROW && row < COLANDROW - 1) {
            row = row + 1;
            col = 0;
        }
        if (row >= COLANDROW && col >= COLANDROW) {
            return true;
        }
        if (row < SRN) {
            if (col < SRN) {
                col = SRN;
            }
        } else if (row < COLANDROW - SRN) {
            if (col == (int) (row / SRN) * SRN) {
                col = col + SRN;
            }
        } else {
            if (col == COLANDROW - SRN) {
                row = row + 1;
                col = 0;
                if (row >= COLANDROW)
                    return true;
            }
        }

        for (int num = 1; num <= COLANDROW; num++) {
            if (CheckIfSafe(row, col, num)) {
                mat[row][col] = num;
                if (fillRemaining(row, col + 1)) {
                    return true;
                }
                mat[row][col] = 0;
            }
        }
        return false;
    }

    private void removeKDigits() {
        int count = MISSING;
        while (count != 0) {
            int cellId = randomGenerator(COLANDROW * COLANDROW);
            int i = (cellId / COLANDROW);
            int j = cellId % 9;
            if (j != 0) {
                j = j - 1;
            }
            if (mat[i][j] != 0) {
                count--;
                mat[i][j] = 0;
            }
        }
    }

    public void printSudoku() {
        for (int i = 0; i < COLANDROW; i++) {
            for (int j = 0; j < COLANDROW; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int columnrow = 9, missing = 20;
        SudokuGenerator sudoku = new SudokuGenerator(columnrow, missing);
        sudoku.fillValues();
        sudoku.printSudoku();
    }
}

