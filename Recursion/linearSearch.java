import java.util.ArrayList;

public class linearSearch {
    public static boolean targetIndex(int arr[],int target,int i) {
        if(i==arr.length-1){
            return false;
        }
        return arr[i]==target || targetIndex(arr, target, i+1);
    }
    public static int lastIndex(int arr[],int target,int i) {
        if(i==-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
            return lastIndex(arr, target, i-1);
        }
        
    }
    // static ArrayList<Integer>list=new ArrayList<>();
    public static ArrayList<Integer> allIndex(int arr[],int target,int i,ArrayList<Integer>list){
        if(i==arr.length-1){
            return list ;
        }
        if(arr[i]==target){
            list.add(i);
        }
       return allIndex(arr, target, i+1,list);


    }
    public static ArrayList<Integer> givingList(int arr[],int target,int i){
        ArrayList<Integer>list=new ArrayList<>();
        if(i==arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer>l1=givingList(arr, target, i+1);
        list.addAll(l1);
        return list;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,7,8,3,7,4};
        System.out.println(targetIndex(arr,7,0));
        System.out.println(lastIndex(arr,7,arr.length-1));
        System.out.println(allIndex(arr,7,0,new ArrayList<>()));
        System.out.println(givingList(arr, 7, 0));
    }
}
