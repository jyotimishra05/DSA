import java.util.ArrayList;

public class countInversion {
    public static int merge(int arr[],int low,int mid,int high){
        ArrayList<Integer>list =new ArrayList<>();
        int count=0;
        int left = low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                count+=(mid-left+1);
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
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        return count;
    }
    public static int mergeSort(int a[],int low,int high){
        int count =0;
       
        if(low>=high) return count;
        int mid=low+(high-low)/2;
        count+=mergeSort(a, low, mid);
        count+=mergeSort(a, mid+1, high);
        count+=merge(a,low,mid,high);
        return count;
    }

   public static void main(String[] args) {
      int arr[]={5, 3, 2, 1, 4}; //‘A[i]’ > ‘A[j]’
    int count = mergeSort(arr,0,arr.length-1);
    System.out.println(count);
   } 
}
