import java.util.Arrays;

public class missingAndRepeating {
    public static int[] findErrorNums(int[]arr) {
        int res[]=new int[2];
        for(int i=0;i<arr.length;i++){
            int posval = Math.abs(arr[i]);
            if(arr[posval-1]>0){
               arr[posval-1]=-arr[posval-1]; 
            }
            else{
                res[0]=posval;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                res[1]=i+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        int arr[]=findErrorNums(nums);
        System.out.println(Arrays.toString(arr));
        
    }
}
