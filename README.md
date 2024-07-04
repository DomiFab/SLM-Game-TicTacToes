workflow dokumentation 
# Tic-Tac-Toe

Dieses Projekt ist eine digitale Umsetzung des klassischen Tic-Tac-Toe-Spiels, entwickelt in Java. Es umfasst die vollständige Implementierung der Spielregeln, das Umschalten zwischen zwei Spielern und die Anzeige des aktuellen Spielstands.

## Features

- Zwei-Spieler-Modus
- Anzeige des aktuellen Spielstands
- Benachrichtigung über Sieg, Niederlage oder Unentschieden
- Möglichkeit, ein neues Spiel zu starten

## Klassen und Diagramm

Das Projekt folgt der untenstehenden Klassenstruktur:

### Klassendiagramm

```plaintext
+-------------------+
|   TicTacToeGame   |
+-------------------+
| - player1: Player |
| - player2: Player |
| - currentPlayer: Player |
| - board: Board |
+-------------------+
| + start(): void |
| + switchCurrentPlayer(): void |
| + hasWinner(): boolean |
+-------------------+

+-------------------+
|       Player      |
+-------------------+
| - marker: char    |
+-------------------+
| + Player(marker: char): Player |
| + getMarker(): char |
+-------------------+

+-------------------+
|       Board       |
+-------------------+
| - cells: char[][] |
+-------------------+
| + Board(): Board |
| + isCellEmpty(x: int, y: int): boolean |
| + place(x: int, y: int, marker: char): void |
| + isFull(): boolean |
| + clear(): void |
| + print(): void |
+-------------------+

