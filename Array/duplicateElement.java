public class duplicateElement {
    public static void main(String[] args) {
        // int nums[] = {1,3,0,2,2};
        // boolean visited[] = new boolean[nums.length-1]; // nums.length -1 because atleast one element is repeated to max element should be length-1

        // for(int i=0;i<nums.length;i++){
        //     if(visited[nums[i]]){
        //         System.out.println(nums[i]);
        //     }
          
        //         visited[nums[i]]=true;
            
        // } 
        // tc = O(N) SC = O(N)

        //ANOTHER WAY TC=O(N) SC = O(1)  //if the element starts from 1
        // int nums[] = {0,2,1,3,5,4,6,2}; //if contain 0
        // int slow = nums[0]+1;
        // int fast = nums[0]+1;
        // do{
        //     slow=nums[slow]+1;
        //     fast = nums[nums[fast]+1]+1;
        // }while(slow!=fast);
        // slow =nums[0]+1;
        // while(slow!=fast){
        //     slow=nums[slow]+1;
        //     fast = nums[fast]+1;
        // }
        // System.out.println(slow);
    

        int[] nums = {1, 3, 4, 2, 2};
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow=nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow =nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast = nums[fast];
        }
        System.out.println(slow);
    }
}
