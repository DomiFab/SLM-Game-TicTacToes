package ticTacToe;

import board.Board;
import player.Player;

import java.util.Scanner;

public class TicTacToe {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (!hasWinner() && !board.isFull()) {
            board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());
            System.out.print("row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("column (0-2): ");
            int col = scanner.nextInt();
            if (board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                if (hasWinner()) {
                    board.print();
                    System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                    return;
                }
                switchCurrentPlayer();
            } else {
                System.out.println("Cell is not empty, try again.");
            }
        }
        board.print();
        System.out.println("Game Over! \nGame ended in a Draw!");
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean hasWinner() {
        char[][] cells = board.getCells();
        char marker = currentPlayer.getMarker();

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((cells[i][0] == marker && cells[i][1] == marker && cells[i][2] == marker) ||
                    (cells[0][i] == marker && cells[1][i] == marker && cells[2][i] == marker)) {
                return true;
            }
        }

        // Check diagonals
        if ((cells[0][0] == marker && cells[1][1] == marker && cells[2][2] == marker) ||
                (cells[0][2] == marker && cells[1][1] == marker && cells[2][0] == marker)) {
            return true;
        }

        return false;
    }
}
