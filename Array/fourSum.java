import java.util.ArrayList;
import java.util.Arrays;


public class fourSum {
    public static ArrayList<ArrayList<Integer>> getfourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue; //if j is not just second element after i and its repeated skip
                    int x = j+1;
                    int y = nums.length-1;
                    while (x<y) {
                        int sum = nums[i]+nums[j]+nums[x]+nums[y];
                        if(sum==target){
                            ArrayList<Integer>tempList= new ArrayList<>();
                            tempList.add(nums[i]);
                            tempList.add(nums[j]);
                            tempList.add(nums[x]);
                            tempList.add(nums[y]);
                            list.add(tempList);
                            x++;
                            y--;
                            while(x<y && nums[x]==nums[x-1]) x++;
                            while(x<y && nums[y]==nums[y+1]) y--;

                        }
                        else if(sum<target){
                            x++;
                        }
                        else{
                            y--;
                        }

                        
                    }
            }
        }

        
        return list;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int  target = 0;
        ArrayList<ArrayList<Integer>>list = getfourSum(nums,target);
        for(ArrayList<Integer>li :list){
            System.out.println(li);
        }

    }
}
