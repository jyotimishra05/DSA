import java.util.Arrays;

public class allPathRLDU {
    static void allPaths(String p,boolean[][]board,int r,int c){
        
        if(r==board.length-1 && c==board[0].length-1){
            // System.out.println(p);
            return;
        }
       if(board[r][c]==false){
        return;
       }
       //same path paith can come twice check
       board[r][c]=false;
        //down
        if(r<board.length-1 ){

            allPaths(p+"D", board, r+1, c);
            
        }
        //right
        if(c<board[0].length-1){
            
            allPaths(p+"R", board, r, c+1);
            
        }
        //up
        if(r>0 ){
            
            allPaths(p+"D", board, r-1, c);
            
        }
        //left
        if(c>0 ){
            
            allPaths(p+"R", board, r, c-1);
            
        }
        //this line is where the fn is over 
        //so before the fn gets remove also remove the chnages made by that fn

        //different path -visited pair can come again , make it unvisited 
        board[r][c]=true;



    }

    static void allPathPrint(String p,boolean[][]board,int r,int c,int step,int path[][]){
        if(r==board.length-1 && c==board[0].length-1){
            path[r][c]=step;
            for(int arr[]:path){
                System.out.println(Arrays.toString(arr));
            }
            // System.out.println(Arrays.deepToString(path));
            System.out.println();
            System.out.println(p);
            return;
        }
       if(board[r][c]==false){
        return;
       }
       //same path paith can come twice check
       board[r][c]=false;
       path[r][c]=step;
        //down
        if(r<board.length-1 ){

            allPathPrint(p+"D", board, r+1, c,step+1,path);
            
        }
        //right
        if(c<board[0].length-1){
            
            allPathPrint(p+"R", board, r, c+1,step+1,path);
            
        }
        //up
        if(r>0 ){
            
            allPathPrint(p+"D", board, r-1, c,step+1,path);
            
        }
        //left
        if(c>0 ){
            
            allPathPrint(p+"R", board, r, c-1,step+1,path);
            
        }
        
        board[r][c]=true;




    }
    public static void main(String[] args) {
    boolean [][]board={
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
    
        allPaths("",board,0,0);
        int path[][]=new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, 1,path);
    }
}
