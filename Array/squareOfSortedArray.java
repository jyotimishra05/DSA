import java.util.Arrays;

public class squareOfSortedArray {
    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        int i=0;
        int j= nums.length-1;
        int arr[]=new int[nums.length];

        //since the array is already sorted so either the square of last element or first element has greater square therefore start the loop from last
        for(int k=nums.length-1;k>=0;k--){
            int comp1 = nums[i]*nums[i];
            int comp2 =  nums[j]*nums[j];
            if(comp1>comp2){
                arr[k]=comp1;
                i++;
            }
            else{
                arr[k]=comp2;
                j--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
