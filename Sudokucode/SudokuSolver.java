public class SudokuSolver {

private static final int GRID_SIZE =9;

    public static void main(string[] args) {
    
        int [][] board = {
    { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
    { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
    { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
    { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
    { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
    { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
    { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
    { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
        };
     }
    private static boolean isNUmberInRow(int [][] board, int number, int row){
    for (int i = 0; i < GRID_SIZE; i++){
        if (board [row][i] == number) {
            return true;
        }
    }
    return false;
}
    private static boolean isNUmberInColumn(int [][] board, int number, int column){
    for (int i = 0; i < GRID_SIZE; i++){
        if (board [i][column] == number) {
            return true;
        }
    }
    return false;
}


}