public class kthPositiveNumber {
    public static int missingK(int[]arr, int k) {
  
        int low =0;
        int high =arr.length-1;
        //find the near by indexes 
        while(low<=high){
            int mid = (low+high)/2;
            //2 3 4 7 11
            //0 1 2 3 4
            //1 2 3 4 5
            // let mid =2
            //missing till arr[2](4)
            //arr[2]-(mid+1)
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }


        }
        //missing = arr[high]+more
        //more = k-(arr[high]-(high+1))
        //missing = arr[high]+k-arr[high]+high+1
        //high+1+k
        return low+k;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7};
        int k = 3;
        int res=missingK(arr,k);
        System.out.println(res);
        
    }
}
