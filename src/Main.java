package src;

public class Main {
    public static void main(String[] args) {
        Chessboard board = new Chessboard();

        board.putPiece(0,0,1);
        board.putPiece(0,1,1);
        System.out.print(board.printBoard());
    }
}
