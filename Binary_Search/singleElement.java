public class singleElement {
    public static int findElement(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        // as if have to check in left and right side of the mid element so in order to avoid writing lots of edge case 
        // start it from index 1 to n-2;
        //seperate check for start and end
        int n = arr.length;
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int s=1;
        int e=n-2;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            //eliminate left half
            // odd mid%2==1
            // left (e,o)
            // at odd index then check prev which is even whether both are equal (then eleminate left)
             if (mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1]){
                            s=mid+1;
             }
             else{
                e=mid-1;
             }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        //1 1 2 2 3 3 4 5 5 6 6
        //e o e o e o _ o e o e
        // if i am standing at even(e) and next of it is odd(o) then i am in the left half of the single element
        //if i am standing at odd and next of it is even then i am in the left half of the single element
        //(even , odd ) -> element is on the right half
        //(odd,even) -> element is on the left half
        int arr[]={1,1,2,3,3,4,4,8,8};
        int ans = findElement(arr);
        System.out.println(ans);

    }
}


// int s=0;
// int e=nums.length-2;
// while(s<=e){
//     int mid=s+(e-s)/2;
//     if(nums[mid]==nums[mid^1]){
//         //left half -> move in right side
//         s=mid+1;
//     }
//     else{
//         e=mid-1;
//     }
// }
// return nums[s];