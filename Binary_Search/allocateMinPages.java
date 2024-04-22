public class allocateMinPages {
    
    public static int splitArrayLargestSum(int arr[],int k){
        int s=0;  //if we each book to every single student [7] [2] [5] [10] [8] :take max (max partion)
        int e=0;  //if we assign every book to single student (min partion)  got the range (s ,e)
        for(int i=0;i<arr.length;i++){
            s=Math.max(s, arr[i]);
            e=e+arr[i];
        }
       
        while(s<e){
            int mid = s+(e-s)/2;
            // if(isFeasible(arr,k,mid)){   // cut should be equal to k validate it to the left side because we have to min the max number of pages 
            //     e=mid;


            // }
            // else{
            //     s=mid+1;
            // }
            int sum=0;
            int pieces=1;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]>mid){
                    pieces++;
                    sum=arr[i];
                }
                else{
                    sum+=arr[i];
                }
            }

            if(pieces>k){  //less pages more pieces(student) , more pieces less pages(mid)
                //more pieces therefore we have to increase the individual subarray sum (mid)
                s=mid+1;

            }
            else{
                e=mid;
            }
        }
       
        return s;  //s or e


    }
    
    public static void main(String[] args) {
       int nums[] = {7,2,5,10,8};
       int k = 2;
       int ans =splitArrayLargestSum(nums,k);
       System.out.println(ans);
       
    }
}
