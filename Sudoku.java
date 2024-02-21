public class Sudoku {

    public static boolean isSafe(int[][] grid , int rows , int cols, int num) {
        // cols
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[rows][i]== num) {
                return false;
            }
        }
        // rows
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][cols]== num) {
                return false;
            }
        }

        //box
        int sr = (rows/3) *3;
        int sc = (cols/3) *3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 if (grid[sr+i][sc+j]==num) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean Sudoku(int[][] grid, int rows, int cols) {
        if (rows == 9) {
            return true;
        }
        
        int nextrow = rows , nextcol = cols+1;
        if (cols +1 == 9) {
            nextrow = rows+1;
            nextcol = 0;
        }
        if (grid[rows][cols] != 0) {
            return Sudoku(grid, nextrow, nextcol);
        }
        for (int i = 1; i <=9 ; i++) {
            if (isSafe(grid , rows, cols, i )) {
                grid[rows][cols] = i;
                if (Sudoku(grid, nextrow, nextcol)) {
                    return true;
                }
                grid[rows][cols] = 0;
            }  
        }
        return false;

    }
    public static void print(int[][] box) {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) { 
        int [][] grid = {  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}  };
        
        Sudoku(grid, 0, 0);
        print(grid);

    }
}
