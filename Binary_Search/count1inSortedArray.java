public class count1inSortedArray {
    public static int countOccurenceOf1(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        
        while (s<=e) {
            int mid = s+(e-s)/2;
            // System.out.println(mid);
            if(arr[mid]==0){  //that means one is present in right side
                s=mid+1;
            }
            else{    // if arr[mid]==1 then find the first occurence as this is sorted array contains only
                     // 0 and 1 therefore arr.length-firstoccurence+1;
                 if(mid==0 || arr[mid-1]==0) {    //0,0,0,1,1,1,1
                    return arr.length-mid;
                 }  
                 else{
                    e=mid-1;
                 }

            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,1,1,1,1,1,1,1};
        System.out.println(countOccurenceOf1(arr,1));
    }
}
