public class minInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int s=0;
        int e= nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[s]<=nums[e]){ //sorted
                ans = Math.min(ans, nums[s]);
                return ans ;
            }
            if(nums[s]<=nums[mid]){ //checking around mid right and mid left
                ans = Math.min(ans,nums[s]);
                s=mid+1 ;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                e=mid-1 ;
            }
        }
        return ans ;
    }
    public static int countRotation(int arr[]){
        int s=0;
        int e= arr.length-1;
        int ans =Integer.MAX_VALUE;
        int count=-1;
        while (s<=e) {
            int mid= s+(e-s)/2;
            if(arr[s]<=arr[e]){ //sorted
                count=s;
                ans = Math.min(ans, arr[s]);
                return count ;
            }
            if(arr[s]<=arr[mid]){
                count=s;
                ans = Math.min(arr[s], ans);
               
                s=mid+1;
            }
            else{
                count=s;
                ans = Math.min(arr[mid], ans);
            
                e=mid-1; 
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
       int nums[] = {3,4,5,1,2};
       System.out.println(findMin(nums));
       int count = countRotation(nums);
       System.out.println(count);
    }
}
