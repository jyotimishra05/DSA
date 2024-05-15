import java.util.Arrays;
import java.util.Stack;

public class slidingWindowMax {
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        
        int nextGreater[]=new int[nums.length];
        Stack<Integer>st = new Stack<>();
        st.push(nums.length-1);
        nextGreater[nums.length-1]=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            while (!st.isEmpty() && nums[st.peek()]<=nums[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=nums.length;
            }
            else{
                nextGreater[i]=st.peek();
            }
            st.push(i);
        }
        // System.out.println(Arrays.toString(nextGreater)); //[1, 4, 4, 4, 6, 6, 7, 8]
            //{1,3,-1,-3,5,3,6,7}
            // 0 1  2  3 4 5 6 7
            //starting j from i to k(length)
            //8-3 =5  when i = 5 j=5 to k(length)
            // consider last index i =length-k
        for(int i=0;i<=nums.length-k;i++){    
        //enter the loop to find the max of window starting at i
         int j=i;
         while (nextGreater[j]<i+k) {   //as we had stored the next greater index in nextGreater array
            j=nextGreater[j];
         }

         System.out.println(nums[j]);
           
        }
    }
}
