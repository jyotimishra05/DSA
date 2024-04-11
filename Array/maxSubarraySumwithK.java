public class maxSubarraySumwithK {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,9,9,9};
        int k=3;
        int wsum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum=wsum+arr[i];
            
        }
        for(int i=k;i<arr.length;i++){
            
            wsum=wsum-arr[i-k]+arr[i];
            msum=Math.max(msum, wsum);
        }
        System.out.println(msum);
    }
    
}
