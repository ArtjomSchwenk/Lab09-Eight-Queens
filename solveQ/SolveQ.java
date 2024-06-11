package solveQ;



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
