public class countSubsetSum {
    public static int countSubsets(int arr[],int sum,int i){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(i==arr.length){
            return 0;
        }
        return countSubsets(arr,sum-arr[i],i+1)+countSubsets(arr,sum,i+1);

    }
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 6, 8, 10};
       System.out.println(countSubsets(arr,10,0));
    }
}
