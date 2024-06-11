package src;

public class Chessboard {
    public String[][] board = new String[8][8];

    public Chessboard(){
        for(int h = 0; h < 8; h++) {        // sets null to 0
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
        String res = "#. a b c d e f g h \n";

        for(int h = 0; h < 8; h++) {
            res += h+1 + ". ";
            for(int v = 0; v < 8; v++){
                if (board[h][v] == "0") {   // changes "0" to "_" for aesthetic reasons
                    board[h][v] = "_";
                }
                res += board[h][v] + " ";
            }
            res += "\n";
        }

        return res;
    }
}
