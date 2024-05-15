import java.util.Arrays;
import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[]={1,3,4,2};
        int nxtg[]=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        st.push(arr[arr.length-1]);
        nxtg[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();
                
            }
            
            if(st.isEmpty()){  //st.isEmpty()
                nxtg[i]=-1;
            }
            else{
                nxtg[i]=st.peek();
            }
            st.push(arr[i]);
        }
       System.out.println(Arrays.toString(nxtg));

       //circular 
       st = new Stack<>();
       int nums[]={1,2,1};
       int nxtg2[]=new int[nums.length];
       int n = nums.length;
       
       
        for(int i=2*n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    nxtg2[i] = -1;
                } else {
                    nxtg2[i] = st.peek();
                }
            }
            st.push(nums[i % n]);
        }
       System.out.println(Arrays.toString(nxtg2));

    }
}
