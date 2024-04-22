public class medianOfTwoSortedArray {
    public static double findMedian(int arr1[],int arr2[]){
        if(arr2.length<arr1.length){
            findMedian(arr2, arr1);
        }
        //we have to apply binary search on arr1 (which is smaller in length)
        int s=0;
        int e=arr1.length;  //supose we had taken all the element in the left side;
        while (s<=e) {
            int midarr1 = s+(e-s)/2;
            int midarr2 = (arr1.length+arr2.length+1)/2-midarr1;  //+1 to find the median on both even/ odd length array
            //if no element on the left side
            int maxLeftOfarr1 = midarr1==0 ? Integer.MIN_VALUE : arr1[midarr1-1]; 
            int maxLeftOfarr2 = midarr2==0 ? Integer.MIN_VALUE : arr2[midarr2-1];
            ////if no element on the right side
            int minRightOfarr1 = midarr1==arr1.length ? Integer.MAX_VALUE : arr1[midarr1]; 
            int minRightOfarr2 = midarr2==arr2.length ? Integer.MAX_VALUE : arr2[midarr2]; 
             
            if(maxLeftOfarr1<= minRightOfarr2 && maxLeftOfarr2 <=minRightOfarr1){
                //find median
                if((arr1.length+arr2.length)%2==0){  //even length array
                    return (Math.max(maxLeftOfarr1,maxLeftOfarr2)+Math.min(minRightOfarr1, minRightOfarr2))/2.0;
                }
                else{
                    return (double)(Math.max(maxLeftOfarr1,maxLeftOfarr2));
                }
            }

            if(maxLeftOfarr1>minRightOfarr2){
                e= midarr1-1;
            }
            else{
                s= midarr1+1;
            }
            
        }
        return 0.0 ; 
    }
    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2};
        System.out.println(findMedian(nums1, nums2));
        
    }
}
