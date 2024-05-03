import java.util.ArrayList;

public class reversePair {
    public static void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right=mid+1;
        ArrayList<Integer>list = new ArrayList<>();
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
            
        }
        while(left<=mid){
            list.add(arr[left]);
                left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        //list 0,1,2,3  arr[]=first index low ,....let 4 5 6 7  ,(low) i=4 -> 0(we want 0th index of list) ->(i-low)
        //sub base index 4->4-4=0, 5->5-4 =1  , 6->6-4 =2 ....
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static int countPair(int arr[],int low,int mid,int high){
        int count=0;
        int right = mid+1;
       for(int left=low;left<=mid;left++){
        while(right<=high && arr[left]>2*arr[right]){
            right++;
        }
            count=count+(right-(mid+1));
            

        
          

       }
       return count;
    }
    public static int mergeSort(int arr[],int low,int high){
        int count =0;
        int mid = low+(high-low)/2;
        if(low>=high) return count;
        count+=mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid+1, high);
        count+=countPair(arr,low,mid,high);
        //Need to merge after countpair if left and right are sorted then no need to check from 
        //start in the right side for each element in left which satisfy the cond (left>2*right)
        //if fail we can start from right ++ 
        merge(arr,low,mid,high);
        
        return count;

    }
    public static void main(String[] args) {
        //arr[left]>2*arr[right]
        int arr[]={2,4,3,5,1};
       int count= mergeSort(arr,0,arr.length-1);
       System.out.println(count);
    }
    
}
