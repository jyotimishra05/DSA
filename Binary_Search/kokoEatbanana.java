public class kokoEatbanana {
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
   
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int calculateTotalHours(int arr[],int h){
        int totalh =0;
        for(int i=0;i<arr.length;i++){
            totalh+= Math.ceil((double)(arr[i])/(double)(h));
        }
        return totalh;
    }
    public static int minEatingSpeed(int arr[],int h){
        //30,11,23,4,20 min how many banana it takes per hour (which is less than equal to h)
        //at max it can take total h hours to finish all the banana
        //max how many it can take per hour
        int low=0;
        int high = findMax(arr);
        while(low<=high){
            int mid = (low+high)/2;
            int totalHours = calculateTotalHours(arr,mid);
            if(totalHours<=h){   //this can be ans but we want min
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        } 
        return low; //high has cross the low 
    }
    public static void main(String[] args) {
        int arr[]={30,11,23,4,20};
        int h = 5;
       int ans= minEatingSpeed(arr,h);
       System.out.println(ans);
    }
}
