public class missingNumber {
    public static void main(String[] args) {
        // int nums[]={1,2,4,5,0};
        int nums[]={1,2,4,5};
        int n=nums.length;
    //    int tsum = n*(n+1)/2;
        // int tsum =((n+1)*(n-1+1))/2;   //n=n+1 including missing number if starts from zero
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        // }
        // System.out.println(tsum-sum);


        //Another way using XOR !  a^a=0 , a^0= a
        int xor1=0;
        int xor2=0;

        //1 2 4 5    //0,1,2,3,4,5
        for(int i=0;i<nums.length;i++){
           xor1=xor1^nums[i];
           xor2=xor2^(i+1);

        }
        
System.out.println(xor1^xor2^(nums.length+1));
    }
}
