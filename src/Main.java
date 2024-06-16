package src;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard(10, 10);
        chessboard.solveQueens(0);
        System.out.println(chessboard.printBoard());
    }
}
