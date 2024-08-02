package src;

public class Chessboard {
    Integer[][] board;
    int rowSize;
    int colSize;

    public Chessboard(int row, int col) {
        board = new Integer[row][col];
        rowSize = row;
        colSize = col;
        resetBoard();
    }

    public void resetBoard() {                  // resets board
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++)
                board[row][col] = 0;
    }

    public void putPiece(int row, int col, int piece) {
        board[row][col] = piece;
    }

    public boolean isSafe(int row, int col) { // Wenn Queen in selber col dann FALSE
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) { // check diagonale
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

    public boolean solveQueens(int row) {
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

    public String printBoard() {
        String res = "#. a b c d e f g h \n";

        for (int row = 0; row < rowSize; row++) {

            if (row < 9) res += "0"+ (row + 1) + ". ";
            else res += (row + 1) + ". ";

            for (int col = 0; col < colSize; col++) {
                res += board[row][col] + " ";
            }
            res += "\n";
        }

        return res;
    }
}
