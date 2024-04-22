public class positionOfElementInInfiniteSortedArray {
    public static int binarysearch(int arr[],int s,int e,int target){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static int ans(int arr[],int target){
        //firstfined the range
        //first start with the range of two
        if(arr.length==1){
            return 0;
        }
        int s=0;
        int e=1;
        //condition for the target to lie in the range
        while(target>arr[e]){  //i.e lie in the right side therefore double the range
            int newStart= e+1;
            //e = 1+double the box size
            e = 1+ (s-e+1)*2;  //using s here so updating it later
            s=newStart;

        }
        return  binarysearch(arr, s, e, target);

    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
            100, 130, 140, 160, 170};
        System.out.println(ans(arr,10));
        
    }
    
}
