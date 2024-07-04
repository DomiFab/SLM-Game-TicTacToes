package board;

import java.util.Arrays;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }

    public boolean isFull() {
        for (char[] row : cells) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        for (char[] row : cells) {
            Arrays.fill(row, ' ');
        }
    }

    public void print() {
        System.out.println("▁▁▁▁▁▁");
        for (char[] row : cells) {
            System.out.print("|");
            for (char cell : row) {
                System.out.print(cell + "|");
            }
            System.out.println();
        }
        System.out.println("▔▔▔▔");
    }

    public char[][] getCells() {
        return cells;
    }
}
