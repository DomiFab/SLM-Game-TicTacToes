package board;

import java.util.Arrays;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];
        clear();
    }

    //TODO: public boolean isCellEmpty(int x, int y) {}

    //TODO: public void place(int x, int y, char marker) {}

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

    //TODO: public void print() {}

    public char[][] getCells() {
        return cells;
    }
}
