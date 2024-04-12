import java.util.ArrayList;

public class nQueenProblem {
    static int queens(boolean board[][],int row){
        if(row==board.length){
            display(board);
          System.out.println();
            return 1;
        }
        int count =0;
// If row equals the size of the chessboard (board.length), it means we've successfully placed queens in all rows (reached the end of the chessboard). In this case, we display the current state of the board and return 1 to indicate a valid placement.
// If row is less than the size of the chessboard, we iterate over each column in the current row (col).
// For each column, we check if it's safe to place a queen at the current position using the isSafe method
        for(int col=0;col<board.length;col++){
            
            if(isSafe(board,row,col)){
                // If it's safe, we place a queen at position 
                board[row][col]=true;
                // recursively call queens for the next row 
                count+=queens(board, row+1);
                // After the recursive call, we backtrack by removing the queen from the current position 
                board[row][col]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean board[][],int row ,int col){
        //check vertical row -: No queens in the same column.
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //diagonal left :-  No queens in the diagonal left.
        int maxLeft =Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right :-  No queens in the diagonal right.
        int maxRight =Math.min(row, board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }
    static void display(boolean board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

    }


    public static ArrayList<String>generateList(boolean board[][]){
        ArrayList<String>inner = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<board[0].length;j++){
                    sb.append(board[i][j]? "Q" :".");
                }
                inner.add(sb.toString());
            }
            return inner;

    }
    public static void totalSolutions(boolean board[][],int row, ArrayList<ArrayList<String>> result){
        if(row==board.length){
            result.add(generateList(board));
            return ;

        }
        
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col]=true;
                totalSolutions(board, row+1,result);
                board[row][col]=false;
            }

        }
       
    }

    public static ArrayList<ArrayList<String>> solveNQueens(int n) {
        boolean board[][]=new boolean[n][n];
        // ArrayList<String>result =totalWays(board,n);
        // for (String item : result) {
        //     System.out.println(item);
        // }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        totalSolutions(board,0,result);
        return result;
        
    }
 public static void main(String[] args) {
    int n=4;
    boolean board[][]=new boolean[n][n];
    int count=queens(board, 0);
    System.out.println(count);
    ArrayList<ArrayList<String>>ans=solveNQueens(4);

    // for (ArrayList<String> list : ans) {
    //     for (String element : list) {
    //         System.out.print(element + " ");
    //     }
    //     System.out.println(); 
    // }

    System.out.println(ans.toString());
    
 }   
}
