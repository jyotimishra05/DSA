public class subarrayWithMaximumProduct {
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        int suffix =1;
        int prefix =1;
        int maxProd = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(suffix==0) suffix =1;
            if(prefix==0) prefix=1;
            suffix = suffix*nums[i];
            prefix=prefix*nums[nums.length-1-i];
             maxProd=Math.max(maxProd,Math.max(suffix,prefix));
        }
        System.out.println(maxProd);
    }
}
