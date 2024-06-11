package src;

public class Main {
    public static void main(String[] args) {
        Chessboard board = new Chessboard();

        board.putPiece(0,0,"Q");
        System.out.print(board.printBoard());
    }
}
