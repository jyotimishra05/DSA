public class CapacityToShipPkgWithinDDays {
    public static int shipWithinDays(int[] weights, int cap) {
        int day =1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            load+=weights[i];
            if(load >cap){
                day++;
                load=weights[i];
            }
        }
        return day;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int low = Integer.MIN_VALUE;  //as we have to load all the weights take the max weight as low 
        // if low =9 then can't load 10
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid = (low+high)/2;

            int day =shipWithinDays(arr, mid);
            if(day<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}
