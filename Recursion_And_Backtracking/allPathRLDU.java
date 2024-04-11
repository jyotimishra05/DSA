public class allPathRLDU {
    static void allPaths(String p,boolean[][]board,int r,int c){
        
        if(r==board.length-1 && c==board[0].length-1){
            System.out.println(p);
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
    public static void main(String[] args) {
    boolean [][]board={
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
        allPaths("",board,0,0);
    }
}
