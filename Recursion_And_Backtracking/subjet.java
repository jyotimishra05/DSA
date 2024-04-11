import java.util.ArrayList;
import java.util.List;

public class subjet {
    public static ArrayList<ArrayList<Integer>>subsetOfArrayWithDuplicate(int arr[]){
        
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); 
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            int n = outer.size();
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e=n-1;
            for(int j=s;j<n;j++){
                ArrayList<Integer>internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                // System.out.println(internal);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static ArrayList<ArrayList<Integer>>subsetOfArray(int arr[]){
        
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); 

        for(int i=0;i<arr.length;i++){
            int n = outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer>internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                // System.out.println(internal);
                outer.add(internal);
            }
        }
        return outer;
        // List<List<Integer>>outer = new ArrayList<>();
        // outer.add(new ArrayList<>());
        // for(int i=0;i<nums.length;i++){
        //     int n = outer.size();
        //     for(int j=0;j<n;j++){
        //        List<Integer>internal = new ArrayList<>(outer.get(i)) ;
        //        internal.add(nums[i]);
        //        outer.add(internal);
        //     }
        // }
        // return outer;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>>ans= subsetOfArray(arr);
        int arr1[]={1,2,2};
        ArrayList<ArrayList<Integer>>res= subsetOfArrayWithDuplicate(arr1);
        // for(ArrayList<Integer>list:ans){
        //     System.out.println(list);
        // }
        System.out.println(ans);
    }
}




