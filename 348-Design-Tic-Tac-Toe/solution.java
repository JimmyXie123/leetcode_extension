public class TicTacToe {
    int cols[];
    int rows[];
    int diagonal, anti_diagonal;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        cols = new int[n];
        rows = new int[n];
        diagonal = 0;
        anti_diagonal = 0;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int add = player==1?1:-1;
        
        rows[row] += add;
        cols[col] += add;
        if(row==col){
            diagonal += add;
        }
        
        if(row==cols.length-1-col){
            anti_diagonal += add;
        }
        int size = cols.length;
        if(Math.abs(rows[row])==size||
        Math.abs(cols[col])==size||
        Math.abs(anti_diagonal)==size||
        Math.abs(diagonal)==size){
            return player;
        }
        
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */