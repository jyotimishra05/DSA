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
               
                if(arr[s]<ans){
                    count=s;
                    ans = arr[s];
                }
                return count ;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<ans){
                    count=s;
                    ans = arr[s];
                }
               
                s=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    count=mid;
                    ans = arr[s];
                }
            
                e=mid-1; 
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
       int nums[] = {27, 31 ,43 ,45 ,46 ,5 ,11 ,13, 18 ,19 ,20 };
       System.out.println(findMin(nums));
       int count = countRotation(nums);
       System.out.println(count);
    }
}
