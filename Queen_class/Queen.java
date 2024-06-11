package Queen_class;

     // Aufgabe 2
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

    public static void main(String[] args) {
        src.Chessboard chessboard = new src.Chessboard();
        int n = 8; // Change this for different board sizes

        if (chessboard.equals(0)) {
            for (String[] row : chessboard.board) {
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}