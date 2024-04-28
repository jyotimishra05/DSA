import java.util.ArrayList;
import java.util.HashMap;

public class longestSubArraySum {
    public static int longestSubarraywithsumK(int arr[],int k){
        HashMap<Integer,Integer>h = new HashMap<>();
        int sum=0;
        int maxLg=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==k){
                maxLg=Math.max(maxLg, i+1);  

            }
            int rem = sum-k;
            if(h.containsKey(rem)){
                int l = h.get(rem);
                maxLg=Math.max(maxLg, i-l);
            }
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
            
        }
        return maxLg;

    }
    public static int countSubarraySumEqualsK(int arr[],int k){

        int sum=0;
        int count =0;
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==k){
                count+=1;
            }
            if(h.containsKey(sum-k)){
                count+=h.get(sum-k);
            }
            h.put(sum, h.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static int subArray(int arr[],int k){
        int left =0;
        int right=0;
        int sum=arr[0];
        int maxLg=0;
        while(right<arr.length){
            while(left<=right && sum>k){   //till left<=right bcs you have to find the subarray
                sum=sum-arr[left];
                left++;
            }
            if(sum==k){
                maxLg=Math.max(maxLg, right-left+1);
            }
            right++;
            if(right<arr.length){
            sum+=arr[right];
            }


        }
        return maxLg;
    }
    public static ArrayList<Integer> findIndexes(int arr[],int k){
        ArrayList<Integer>list = new ArrayList<>();
        int left =0;
        int right=0;
        int sum=arr[0];
        int maxlg = 0;
        boolean found = false;
        while(right<arr.length){
        //     while(left<=right && sum>k){
        //         sum=sum-arr[left];
        //         left++;
        //     }

        //     if(sum==k){
        //         int length=right-left+1;
        //         if(length>maxlg){
        //             maxlg=length;
        //             list.clear();
        //             list.add(left);
        //             list.add(right);

        //         }
                
                
        //     }
        //     right++;
        //     if(right<arr.length){
        //     sum=sum+arr[right];
        //     }

            if (sum < k) {
                right++;
                if (right < arr.length) {
                    sum += arr[right];
                }
            } else if (sum > k) {
                sum -= arr[left];
                left++;
            } else { // sum == k
                found=true;
                int length = right - left + 1;
                if (length > maxlg) {
                    maxlg = length;
                    list.clear(); // Clear the list as we found a longer subarray
                    list.add(left);
                    list.add(right);
                }
                right++;
                if (right < arr.length) {
                    sum += arr[right];
                }
            }
        

        }
        if(!found && k!=0){
            list.add(-1);
        }
        
        
        // System.out.println(left+" "+right);
        return list;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3};
        // int k=3;
        int nums[]={1, 2, 1, 0, 1, 1, 0};
        int res=longestSubarraywithsumK(nums, 4);  //for all -ve and +ve numbers
        // int res=subArray(nums, 4);
        System.out.println(res);
        int arr[]={1,1,1};
        int k=2;
        // int ans = subArray(arr,k);
        int ans = countSubarraySumEqualsK(arr,k);
        System.out.println(ans);

        //Find Indexes of a subarray with given sum

        int a[]={1,2,3,7,5};
        // int a[]={0};
        // int s=0;
        int s=12;
        ArrayList<Integer>result=findIndexes(a,s);
        for(int element : result){
            System.out.print(element +" ");
        }

    }
}
