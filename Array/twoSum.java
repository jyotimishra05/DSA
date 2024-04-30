import java.util.HashMap;

public class twoSum {
    public static void findIndex(int arr[],int target){
        // int result[]=new int[2];
        // int sum=0;
        HashMap<Integer,Integer>h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                System.out.println(h.get(arr[i])+" "+i);
            }
            h.put(target-arr[i], i);
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 1, 2, 3, 1};    //if sorted use two pointer 
        int target =5;
        findIndex(arr,target);
    }
}
