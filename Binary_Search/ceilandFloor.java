public class ceilandFloor  {
    public static int ceil(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
return s;   // s=mid+1  //smallest element which is greater and equal to target

    }
    public static int floor(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return e;


    }

    public static void main(String[] args) {
        //smalles number greater than equal to target
        //greatest number that is smaller or equal to target
        int arr[]={1,3,5,6};
        int target=2;
        System.out.println(ceil(arr,target));
        System.out.println(floor(arr,target));
    }
}
