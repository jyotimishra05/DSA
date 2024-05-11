
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
         
       
        int arr[]={100,80,60,70,60,75,85};
        int span[]=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        //1 pop()
        //2 answer catch
        //3 push()

        //if stack is empty then span = index+1
        //if arr[st.peek()]<arr[i] pop()
        //if arr[st.peek()]>arr[i] span[i]= i-st.peek()  (shadow)
        st.push(0);  //no element left for comparison
        span[0]=1;  //span index +1
        for(int i=1;i<arr.length;i++){
            while (st.size()>0 && arr[st.peek()]<arr[i]) {
                st.pop();
                
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }

       for(int i=0;i<span.length;i++){
        System.out.print(span[i]+" ");
       }
    }
}
