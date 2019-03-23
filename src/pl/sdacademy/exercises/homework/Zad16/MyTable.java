package pl.sdacademy.exercises.homework.Zad16;

public class MyTable {
    private int[][] table;

    protected MyTable(int width, int height) {
        this.table = new int[height][width];
    }

    protected int[][] getTable() {
        return table;
    }

    protected void setTable(int[][] table) {
        this.table = table;
    }

    protected void printTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
