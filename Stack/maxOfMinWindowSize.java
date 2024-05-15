import java.util.Arrays;
import java.util.Stack;

public class maxOfMinWindowSize {
    //max of min for window size

    public static int maxSlidingWindow(int[] nums, int k) {
        int nextSmallest[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(nums.length - 1);
        nextSmallest[nums.length - 1] = nums.length;
        for (int i = nums.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextSmallest[i] = nums.length;
            } else {
                nextSmallest[i] = st.peek();
            }
            st.push(i);
        }
        // System.out.println(Arrays.toString(nextSmallest)); //[1, 4, 4, 4, 6, 6, 7, 8]
        //{1,3,-1,-3,5,3,6,7}
        // 0 1  2  3 4 5 6 7
        //starting j from i to k(length)
        //8-3 =5  when i = 5 j=5 to k(length)
        // consider last index i =length-k
        int[] result = new int[nums.length - k + 1];
        int idx = 0;
        int j=0;
        for (int i = 0; i <= nums.length - k; i++) {
            //enter the loop to find the max of window starting at i
           if(j<i){
            j=i;
           }
            while (nextSmallest[j] < i + k) {   //as we had stored the next greater index in nextSmallest array
                j = nextSmallest[j];
            }
            result[idx++] = nums[j];
        }
        int max = Integer.MIN_VALUE;

        for(int i=0;i<result.length;i++){
            max=Math.max(max,result[i]);
        }
        // System.out.println(max);
        return max;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int result[] =new int[arr.length];
        int ans;
        for(int i=1;i<=arr.length;i++){
             ans = maxSlidingWindow(arr,i);
            result[i-1]=ans;
        }
        System.out.println(Arrays.toString(result));
    }
}
