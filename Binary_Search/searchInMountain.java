public class searchInMountain {
    public static int binarysearch(int arr[],int target,int s ,int e){

        while (s<=e) {
            int mid = (s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                s=mid+1;
            }
            else{
               e=mid-1; 
            }
            
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){  //ans lie in left side
              e=mid;
    
            }
            else{  //lie right side
                 s=mid+1;
    
            }
            
        }
        return s;
    }
    public static int orderAgnostisArray(int arr[],int target,int s,int e){
        //find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[s]<arr[e];
        while (s<=e) {
            int mid = (s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    s=mid+1;
                }
                else{
                   e=mid-1; 
                }
            }
            else{
                if(arr[mid]>target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            
            
        }
        return -1;
    }
    public static int mainAns(int arr[],int target){
        // step 1: find peak element 
        //step2: search in left side of the peak element inorder to get the min index of target element in bitonic array
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarysearch(arr,target,0,peak); 
        if(firstTry!=-1){  //search in second side of peak element
            return firstTry;
            
        }
        return orderAgnostisArray(arr, target, peak+1,arr.length-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(mainAns(arr, target));

        

        
    }
}
