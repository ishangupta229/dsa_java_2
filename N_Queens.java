public class N_Queens {
    static int count;

    public static boolean Safe(char[] [] Board, int rows , int cols) {
        //vertical
        for (int i = rows-1; i>=0; i--) {
            if (Board[i][cols]=='Q') {
                return false;
            }
        }
        
        // diagonal left
        for (int i = rows-1,j=cols-1; i>=0 && j>=0 ; i--,j--) {
            if (Board[i][j]=='Q') {
                return false;
            }
        }

        //diagonal right
        for (int i = rows-1,j=cols+1; i>=0 && j<Board.length ; i--,j++) {
            if (Board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }



    public static void Queens(char [][] Board, int rows) {
        if (rows == Board.length) {
            print(Board);
            count++;
            return;
        }
        for (int j = 0; j < Board.length; j++) {
            if(Safe(Board, rows, j)==true){
                Board [rows][j] = 'Q';
                Queens(Board, rows+1);
                Board [rows][j]= 'x';
            }
        }
    }
    
    public static void print(char [][] ch) {
        System.out.println("---------------------------");
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();            
        }        
    }

    public static void main(String[] args){
        int n = 5;
        char Board[][] = new char[n][n];

        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[0].length; j++) {
                Board[i][j] = 'x';
            }
        }

        Queens(Board, 0);
        System.out.println();
        System.out.println("Count is : " + count);


    }
    
}
