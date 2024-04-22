import java.util.Arrays;

public class findPairSumInSortedArray {
    public static int[] findIndex(int arr[],int s,int e,int target){
        // int s=0;
        // int e=arr.length-1;
       
        int result[]={-1,-1};
        while (s<e) {  //as we are finding the pair so it will never cross -> (s<e)
            
            if(arr[s]+arr[e]==target){
                result[0]=s;
                result[1]=e;
                return result;
            }
            else if(arr[s]+arr[e]>target){
                e=e-1;
            }
            else{
                s=s+1;
            }
            
        }
      
        return result;
    }
    public static int[] tripletSumIndex(int nums[],int target){
        
        int result[]={-1,-1,-1};
        for(int i=0;i<nums.length;i++){
           
          int ans[]=findIndex(nums,i+1,nums.length-1,target-nums[i]);   //2,3,4,8,9,20,40
            System.out.print("ans"+Arrays.toString(ans));
          result[0]=i;
          result[1]=ans[0];
          result[2]=ans[1];
        }
        
       return result;
    }
    public static void main(String[] args) {
        // int arr[]={2,7,11,15};
        // int target = 9;
        // int ans[] =findIndex(arr,0,arr.length-1,target);
        // // System.out.println(Arrays.toString(ans));
        int nums[]={2,3,4,8,9,20,40};
        int x=32;
        int result[]=tripletSumIndex(nums, x);
        // System.out.println(Arrays.toString(result));
    }
}
