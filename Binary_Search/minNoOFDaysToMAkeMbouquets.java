public class minNoOFDaysToMAkeMbouquets {
    public static boolean possible(int arr[],int day,int k,int m){
        int cut=0;
        int noOfBouquets =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                cut++;
            }
            else{
                noOfBouquets+=(cut/k);
                cut=0;
            }
        }
        noOfBouquets+=(cut/k);
        return noOfBouquets>=m;
    }
    public static int minDays(int[] arr, int m, int k) {
        int n =arr.length;
        long val = (long) m * k;
       if(val>n) return -1;
       int low= Integer.MAX_VALUE, high = Integer.MIN_VALUE;
       for (int i = 0; i < n; i++) {
           low= Math.min(low, arr[i]);
           high = Math.max(high, arr[i]);
       }
       while(low<=high){
           int mid=(low+high)/2;
           if(possible(arr,mid,k,m)){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return low;
       
   }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = minDays(arr, m, k);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
        
    
}
