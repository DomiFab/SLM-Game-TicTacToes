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
        while (/*!hasWinner() &&*/ !board.isFull()) {
            //TODO: Current Board State board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());
            System.out.print("row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("column (0-2): ");
            int col = scanner.nextInt();
            if (board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                if (/*hasWinner()*/true) {
                    //board.print();
                    System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                    return;
                }
                switchCurrentPlayer();
            } else {
                System.out.println("Cell is not empty, try again.");
            }
        }
        //board.print();
        System.out.println("Game Over! \nGame ended in a Draw!");
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    //TODO: Game Results public boolean hasWinner() {}
}
