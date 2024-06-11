package src;

public class Chessboard {
    String[][] board = new String[8][8];

    public void putPiece(int h, int v, String piece){     // horizontal, vertikal, piece
        board[h][v] = piece;
    }
}
