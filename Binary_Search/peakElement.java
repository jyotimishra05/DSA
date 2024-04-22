public class peakElement {
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
    return s;  //s or e
}
   public static void main(String[] args) {
       int nums[]={1,2,3,1};
       System.out.println(peakIndexInMountainArray(nums));
   }
}
