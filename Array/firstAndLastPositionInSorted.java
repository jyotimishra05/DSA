public class firstAndLastPositionInSorted {
    public static int binarySearch(int nums[],int target,boolean isFirst){
        int s=0;
        int e=nums.length-1;
        int ans =-1;
       
        while (s<=e) {
            int mid= (s+e)/2;
            if(nums[mid]==target){
                ans =mid;
                if(isFirst){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target =8;
        int first=binarySearch(nums,target,true);
        int last = binarySearch(nums,target,false);
        System.out.println(first+""+last);
        // System.out.println(new int[]{first,last});
        
    }
}
