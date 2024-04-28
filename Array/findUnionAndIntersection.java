import java.util.ArrayList;
import java.util.Arrays;

public class findUnionAndIntersection {
    public static ArrayList<Integer>getUnion(int a[],int b[]){
        int m = a.length;
        int n = b.length;
        int i=0;
        int j=0;
        ArrayList<Integer>list = new ArrayList<>();
        while (i<m && j<n) {
            if(a[i]<=b[j]){  
                //as the element inside the list is sorted so check the last element with cureent one whether it is existed in the list or not 
                //if list is empty no need to check just add the current element
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
           
        }
        //if any of the array is completed then add the remaining element of another array by checking the conditions
        while(i<m){
            
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            
        }
        while (j<n) {
            
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            
            
        }
        return list;

        
    }
    public static ArrayList<Integer>getIntersection(int a[] , int b[]){
        int m = a.length;
        int n = b.length;
        int i=0;
        int j=0;
        ArrayList<Integer>list = new ArrayList<>();
        while(i<m && j<n){
            if(a[i]==b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                j++;
                
            }
            i++;
        }
        return list;

    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6};
        int b[] = {2, 3, 5};
        ArrayList<Integer>list1 = getUnion(a,b);
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        ArrayList<Integer>list2 = getIntersection(a,b);
        System.out.println();
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }
    }
}





    // public int[] intersection(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int i = 0, j = 0, k = 0;
        // int[] intersection = new int[Math.min(nums1.length, nums2.length)];

        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] == nums2[j]) {
        //         if (k == 0 || nums1[i] != intersection[k - 1]) {
        //             intersection[k++] = nums1[i];
        //         }
        //         i++;
        //         j++;
        //     } else if (nums1[i] < nums2[j]) {
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }
        
        // return Arrays.copyOf(intersection, k);

//         HashSet<Integer>set1= new HashSet<>();
//         HashSet<Integer>intersection= new HashSet<>();
//         for(int i=0;i<nums1.length;i++){
//             set1.add(nums1[i]);
//         }
//         for(int i=0;i<nums2.length;i++){
//             if(set1.contains(nums2[i])){
//                 intersection.add(nums2[i]);
//             }
//         }
//         int size = intersection.size();
//         int arr[]=new int[size];
//         int i=0;
//         for(int num :intersection ){
//             arr[i++]=num;
//         }
//         return arr;
//     }
// }



// public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> a, int n, ArrayList<Integer>b, int m)
// 	{
// 		ArrayList< Integer > list = new ArrayList<>();
//          int i=0;
//          int j=0;
//          while(i<n && j<m){
             
//                  if(a.get(i)<b.get(j)){
//                       i++;
//                  }
//                  else if(a.get(i)>b.get(j)){
//                      j++;
//                  }
//                  else{
//                       list.add(a.get(i));
//                  i++;
//                  j++;
//                  }
                 
             
// 		 }
// 			 return list;
// 		 }