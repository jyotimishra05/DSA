import java.util.HashMap;
import java.util.HashSet;

public class maxSubarraySumwithSizeK {
   
    public static void main(String[] args) {
        // int arr[]={1,5,4,2,9,9,9};
        // int k=3;
        // int wsum=0;
        // int msum=Integer.MIN_VALUE;
        // for(int i=0;i<k;i++){
        //     wsum=wsum+arr[i];
            
            
        // }
        // for(int i=k;i<arr.length;i++){
            
        //     wsum=wsum-arr[i-k]+arr[i];   //sliding window 1+5+4 ,   5+4+2 , 4+2+9....
        //     msum=Math.max(msum, wsum);
            

        // }
        // System.out.println(msum);

        int arr[]={1,5,4,2,9,9,9};
        int k=3;
        int wsum=0;
        int msum=Integer.MIN_VALUE;
        HashMap<Integer,Integer>h = new HashMap<>();
        for(int i=0;i<k;i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);  //1,5,4,2,9,9,9
            wsum=wsum+arr[i];
        }
        if(h.size()==k){
            msum=wsum;
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
            
            //main logic
            if(h.get(arr[j])==1){
                h.remove(arr[j]);
            }
            else{
                h.put(arr[j], h.get(arr[j])-1);
               
            }
            wsum=wsum-arr[j]+arr[i];
            j++;
            
            if(h.size()==k){
                msum=Math.max(msum,wsum);
            }
        }
        System.out.println(msum);
    }
    
}




// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         long maxSum = 0;
//         long currentSum = 0; 
//         HashSet<Integer> set = new HashSet<>();
//         int right = 0;
//          for (int left = 0; left < nums.length; left++) {
//              while (right < nums.length && !set.contains(nums[right]) && set.size() < k) {
//                  set.add(nums[right]);
//                  currentSum += nums[right];
//                  right++;
//              }

//             if (set.size() == k) {
//                 maxSum = Math.max(currentSum, maxSum);
//             }
//              set.remove(nums[left]);
//              currentSum -= nums[left];
//         }

//         return maxSum;
//     }
// }