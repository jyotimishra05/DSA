public class printTraiangle {
    public static void printPattern(int r,int c){
        
        // if(r==0){
        //     return;
        // }
        // if(c<r){
        //     System.out.print("*");
        //     printPattern(r, c+1);
        // }
        // else{
        //     System.out.println();
        //     printPattern(r-1, 0);
        // }

        //normal triangle 
        if(r==0){
            return;
        }
        if(c<r){
                System.out.print("*");
                printPattern(r-1, 0);
            }
            else{
                System.out.println();
                printPattern(r,c+1);
            }
    }
    public static void main(String[] args) {
        printPattern(4,0);
    }
}
