package src;

public class Chessboard {
    Integer[][] board = new Integer[8][8];

    public Chessboard(){
        for(int h = 0; h < 8; h++) {        // sets null to 0
            for(int v = 0; v < 8; v++){
                if (board[h][v] == null) {
                    board[h][v] = 0;
                }
            }
            }
    }

    public void putPiece(int h, int v, int piece){     // horizontal, vertikal, piece
        board[h][v] = piece;
    }

    private boolean isSafe(int row, int col) {
        // Check if there's a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check diagonals
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean solveQueens(int row) {
        int n = board.length;
        if (row == n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solveQueens(row + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }

        return false;
    }

    public String printBoard(){
        String res = "#. a b c d e f g h \n";

        for(int h = 0; h < 8; h++) {
            res += h+1 + ". ";
            for(int v = 0; v < 8; v++){
                res += board[h][v] + " ";
            }
            res += "\n";
        }

        return res;
    }
}
