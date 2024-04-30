import java.util.Arrays;

public class sort01and2 {
    public static void swap(int arr[],int l,int h){
        int temp = arr[l];
        arr[l]=arr[h];
        arr[h]=temp;

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,1,1,0,0,2,0,1,0,1};
        //dutch national flag algo 

        //0-----low-1 (contains0),low-------mid-1(contains1) , mid-------high(contains 0,1,2 unsorted) [we want to make this portion sorted], high+1--------n-1(contains2)

        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
