import java.lang.reflect.Array;
import java.util.Arrays;

public class firstAndLastPosition {
    public static int searchIndex(int[]nums,int target,boolean isFirst){
        int s=0;
        int e=nums.length-1;
        int ans =-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans = mid;
                if(isFirst){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
                
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
       
        int isFirst = searchIndex(nums,target,true);
        int isLast = searchIndex(nums,target,false);
        
    
        return new int[]{isFirst , isLast};
    }
    public static int countOccurencce(int arr[],int target){
        int ansArr[]=searchRange(arr,target);
        return ansArr[1]-ansArr[0]+1;

    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
       int arr[]=searchRange(nums,target);
        System.out.println(Arrays.toString(arr));
        int array[]={1,2,2,2,2,4,5,5,6};
        
        System.out.println("totalOccurence of 2 :"+" "+countOccurencce(array,2));
        
    }
}
