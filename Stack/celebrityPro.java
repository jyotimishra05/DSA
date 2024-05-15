import java.util.Stack;

public class celebrityPro {
    public static void main(String[] args) {
        int N=3;
        int M[][] = {{0, 1 ,0},
                    {0, 0, 0}, 
                    {0 ,1 ,0}};
        Stack<Integer>st = new Stack<>();
        for(int i=N-1;i>=0;i--){
            st.push(i);
        }   
        int first , second;
        while (st.size()>1) {
            first = st.peek();
            st.pop();
            second=st.peek();
            st.pop();
            if(M[first][second]==1 && M[second][first]==0){
                st.push(second);
            }
            else if(M[first][second]==0 && M[second][first]==1){
                st.push(first);
            }
            
        } 
        if(st.isEmpty()){
            System.out.println(-1);
            return;
        }
        int num = st.peek();
        st.pop();

        //validate celebrity
        int row=0;  //row sum==0 col sum ==n-1
        int col=0;
        for(int i=0;i<N;i++){
            row+=M[num][i];
            col+=M[i][num];
        }

        if( row==0&&col ==N-1){
            System.out.println(num);
        }else{
            System.out.println(-1);
        }
    }
    
}
