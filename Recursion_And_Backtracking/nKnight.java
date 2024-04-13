public class nKnight {
    static void nKnights(boolean board[][],int row,int col,int k){
            if(k==0){
                display(board);
                System.out.println();
                return;
               
            }
            //if it reached to the last row and col out of bound
            if(row==board.length-1 && col==board.length){
                return;
            }

            if(col==board.length){
                nKnights(board, row+1, 0, k);
                return;
            }
      
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nKnights(board,row, col+1, k-1);
                board[row][col]=false;
            }
            //in any case if it is not safe move ahead
            nKnights(board, row, col+1, k);
            
  

    }
    static boolean isSafe(boolean board[][],int row,int col){

        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }

        }
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            } 
            
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
            
        }
        return true;
    }
    static boolean isValid(boolean board[][],int row ,int col){
        if(row >=0 && row<board.length  && col >=0 && col<board.length ){
            return true;
        }
        return false;

    }
    static void display(boolean board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==true){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        boolean board [][]= new boolean[n][n];
        nKnights(board, 0, 0, 4);
        
    }
    
}
