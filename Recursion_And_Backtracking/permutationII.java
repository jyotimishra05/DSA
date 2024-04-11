import java.util.ArrayList;
import java.util.Arrays;

/**
 * permutationII
 */
public class permutationII {
    public static ArrayList<ArrayList<Integer>> permutationOfArray(int arr[]){
        ArrayList<ArrayList<Integer>>resultList=new ArrayList<>();
        Arrays.sort(arr);
        backTrackHelper(resultList,new ArrayList<>(),arr,new boolean[arr.length]);
        return resultList;
    }
    public static void backTrackHelper(ArrayList<ArrayList<Integer>>resultList,ArrayList<Integer>tempList,int arr[],boolean used[]){
        if(tempList.size()==arr.length && !resultList.contains(tempList)){
            //create copy 
            resultList.add(new ArrayList<>(tempList));
            return;
        }


        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }

            used[i]=true;
            tempList.add(arr[i]);

            backTrackHelper(resultList, tempList, arr, used);
            used[i]=false;
            tempList.remove(tempList.size()-1);

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<ArrayList<Integer>>list= permutationOfArray(arr);
        System.out.println(list);
    }
}