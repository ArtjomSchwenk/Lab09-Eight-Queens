package src;

public class Chessboard {
    Integer[][] board = new Integer[8][8];

    public Chessboard() {
        for (int row = 0; row < 8; row++) {        // sets null to 0
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == null) {
                    board[row][col] = 0;
                }
            }
        }
    }

    public void putPiece(int row, int col, int piece) {
        board[row][col] = piece;
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

    public String printBoard() {
        String res = "#. a b c d e f g h \n";

        for (int row = 0; row < 8; row++) {
            res += row + 1 + ". ";
            for (int col = 0; col < 8; col++) {
                res += board[row][col] + " ";
            }
            res += "\n";
        }

        return res;
    }
}
   /* AUFGABE 4 aber NICHT implementiert in Chessboard
    public class SolveQ {
        public static void main(String[] args) {
        }

        private static boolean SolveQ(int[][] arr, int row, int col) {
            if (row == 0)
                return true;
            // horizontalchecker
            for (int i = 0; i < arr.length; i++) {
                if (arr[row][i] == 1)
                    return false;

            }
            // vertikalchecker possible von malte
            for (int i = 0; i <= row; i++) {
                if (arr[i][col] == 1)
                    return false;
            }
            // linke Diagonale
            int i = row - 1;
            int j = col - 1;
            while (i >= 0 && j >= 0) {
                if (arr[i][j] == 1)
                    return false;
                i--;
                j--;
            }
            // rechte Diagonale
            i = row - 1;
            j = col + 1;
            while (i >= 0 && j < arr.length) {
                if (arr[i][j] == 1)
                    return false;
                i--;
                j++;
            }
            return true;

        }
        }
    }
*/