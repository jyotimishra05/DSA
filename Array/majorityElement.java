import java.util.ArrayList;
import java.util.List;

public class majorityElement {

    public static List<Integer> majorityElementII(int[] nums) {
        int c1=0;
        int c2=0;
        int cand1 =Integer.MIN_VALUE;
        int cand2 =Integer.MIN_VALUE;
     //At max 2 cand because let say n=3  3/3 =1 element appear more than 3/n  min ele 3/3+1
     //if we take min 2 times 2+2
     //n=9   element appear more than 3/n i.e 9/3=3+1 => 4+4+4=16>9  so ,only two element can appear more than n/3 times
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(c1 ==0 && nums[i]!=cand2){
                c1=1;
                cand1 = nums[i];
            }
             else if(c2 ==0 && nums[i]!=cand1){
                c2=1;
                cand2 = nums[i];
            }
            else if(cand1 ==nums[i]) c1++;
            else if(cand2 ==nums[i]) c2++;   
            
            else{
                c1--;
                c2--;
            }
        }
       c1=0;
       c2=0;
       for (int i=0;i<nums.length;i++) {
            if (nums[i] == cand1 ){
                c1++;
            }
            if (nums[i] == cand2 ){
                c2++;
            }
        }
         int ans= (int)(nums.length / 3) +1;
         if(c1>=ans) list.add(cand1);
         if(c2>=ans) list.add(cand2);
       return list;
    }
    public static void main(String[] args) {
        int arr[] ={3,2,3};
       
        // for(int i=0;i<arr.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //         if(count>arr.length/2){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        
        int count =0;
        int cand =0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                cand =arr[i];
            }
            if(arr[i]==cand){
                count++;
            }
            else{
                count--;
            }
        }
        // System.out.println(count);  we are just getting the cand 
        // Validate if the candidate is the majority element
        count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == cand ){
                count++;
            }
        }
        // System.out.println(count);
        int ans= (count > arr.length / 2) ? cand : -1;
        System.out.println("Majority Element I :" + ans);


        //Majority Element II 
        int nums[]={3,2,3,2,2,1,1,3};
        List<Integer>list = majorityElementII(nums);
        for(int a : list){
            System.out.print("Majority Element II : "+a);
        }
       

    }
}
