package pl.sdacademy.beginner.Gry.Sudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sudoku extends JFrame {
        public static final int GRID_SIZE = 9;
        public static final int CELL_SIZE = 60;
        public static final int CANVAS_WIDTH  = CELL_SIZE * GRID_SIZE;
        public static final int CANVAS_HEIGHT = CELL_SIZE * GRID_SIZE;
        public static final Color OPEN_CELL_BGCOLOR = Color.YELLOW;
        public static final Color OPEN_CELL_TEXT_YES = new Color(0, 255, 0);  // RGB
        public static final Color OPEN_CELL_TEXT_NO = Color.RED;
        public static final Color CLOSED_CELL_BGCOLOR = new Color(240, 240, 240); // RGB
        public static final Color CLOSED_CELL_TEXT = Color.BLACK;
        public static final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);

        private JTextField[][] tfCells = new JTextField[GRID_SIZE][GRID_SIZE];

        private int[][] puzzle =
                {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                        {6, 7, 2, 1, 9, 5, 3, 4, 8},
                        {1, 9, 8, 3, 4, 2, 5, 6, 7},
                        {8, 5, 9, 7, 6, 1, 4, 2, 3},
                        {4, 2, 6, 8, 5, 3, 7, 9, 1},
                        {7, 1, 3, 9, 2, 4, 8, 5, 6},
                        {9, 6, 1, 5, 3, 7, 2, 8, 4},
                        {2, 8, 7, 4, 1, 9, 6, 3, 5},
                        {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        private boolean[][] masks =
                {{false, false, false, false, false, true, false, false, false},
                        {false, false, false, false, false, false, false, false, true},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false, false}};

        public Sudoku() {
            Container cp = getContentPane();
            cp.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
            InputListener listener = new InputListener();
            for (int row = 0; row < GRID_SIZE; ++row) {
                for (int col = 0; col < GRID_SIZE; ++col) {
                    tfCells[row][col] = new JTextField();
                    cp.add(tfCells[row][col]);
                    if (masks[row][col]) {
                        tfCells[row][col].setText("");
                        tfCells[row][col].setEditable(true);
                        tfCells[row][col].setBackground(OPEN_CELL_BGCOLOR);
                        tfCells[row][col].addActionListener(listener);
                    } else {
                        tfCells[row][col].setText(puzzle[row][col] + "");
                        tfCells[row][col].setEditable(false);
                        tfCells[row][col].setBackground(CLOSED_CELL_BGCOLOR);
                        tfCells[row][col].setForeground(CLOSED_CELL_TEXT);
                    }
                    tfCells[row][col].setHorizontalAlignment(JTextField.CENTER);
                    tfCells[row][col].setFont(FONT_NUMBERS);
                }
            }
            cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
            pack();

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Handle window closing
            setTitle("Sudoku");
            setVisible(true);
        }

    private class InputListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int rowSelected = -1;
            int colSelected = -1;
            JTextField source = (JTextField)e.getSource();
            boolean found = false;
            for (int row = 0; row < GRID_SIZE && !found; ++row) {
                for (int col = 0; col < GRID_SIZE && !found; ++col) {
                    if (tfCells[row][col] == source) {
                        rowSelected = row;
                        colSelected = col;
                        found = true;
                    }
                }
            }
        }
    }

        public static void main(String[] args) {
            Sudoku sudoku=new Sudoku();

    }

}
