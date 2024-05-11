import java.util.Arrays;
import java.util.Stack;

public class dailyTemperatue {
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        int n=arr.length;
        int span[]=new int[arr.length];
        span[n-1]=0; 
        Stack<Integer>st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
           while (!st.isEmpty() && arr[st.peek()]<arr[i]) {
                st.pop();
           } 
           if(st.isEmpty()){
            span[i]=0;
           }
           else{
            span[i]=st.peek()-i;
           }
           st.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
