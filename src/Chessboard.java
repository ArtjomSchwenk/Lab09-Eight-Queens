package src;

public class Chessboard {
    String[][] board = new String[8][8];

    public Chessboard(){
        for(int h = 0; h < 8; h++) {
            for(int v = 0; v < 8; v++){
                if (board[h][v] == null) {
                    board[h][v] = "0";
                }
            }
            }
    }

    public void putPiece(int h, int v, String piece){     // horizontal, vertikal, piece
        board[h][v] = piece;
    }

    public String printBoard(){
        String res = "";

        for(int h = 0; h < 8; h++) {
            res += h + ". ";
            for(int v = 0; v < 8; v++){
                if (board[h][v] == "0") {
                    board[h][v] = "_";
                }
                res += board[h][v] + " ";
            }
            res += "\n";
        }
        res += "#. a b c d e f g h";
        return res;
    }
}
