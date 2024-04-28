import java.util.Arrays;

public class moveZerotoTheEnd {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
