import java.util.Arrays;

/**
 * maxSubarraySum
 */
public class maxSubarraySum {

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        //naive solution
        // int sum = 0;
        // int maxSum =0;

        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum=sum+arr[j];
        //         maxSum=Math.max(maxSum, sum);
        //     }

        // }
        // System.out.println(maxSum);


        //efficient solution

        // int sum=arr[0];
        // int maxSum=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(sum>=0){
        //         sum=sum+arr[i];
        //     }
        //     else{  //if sum is negative fresh start from its own position
        //         sum=arr[i];

        //     }
        //     maxSum=Math.max(maxSum, sum);
        // }
        // System.out.println(maxSum);

        //kadans alg
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int curMax =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //if the current max is negative then don't add start it from fresh
            if(curMax<0){
                curMax = nums[i];
            }
            else{
                curMax=curMax+nums[i];
            }
            max = Math.max(curMax , max);
        }
        System.out.println(max);
    }
}