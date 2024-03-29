import java.util.ArrayList;

public class permutationOfArray {
    public static ArrayList<ArrayList<Integer>>permutation(int arr[]){
        ArrayList<ArrayList<Integer>>resultList = new ArrayList<>();
        backTrackHelper(resultList,new ArrayList<>(),arr);

        return resultList;


    }
    public static void backTrackHelper(ArrayList<ArrayList<Integer>>resultList,ArrayList<Integer>tempList,int arr[]){
        if(tempList.size()==arr.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
       

                for(int i =0;i<arr.length;i++){
                    if(tempList.contains(arr[i])){
                        continue;
                    }
                    tempList.add(arr[i]);
                    
                    backTrackHelper(resultList, tempList, arr);
                    tempList.remove(tempList.size()-1);
                    


                }                   
                                            
                                            
                                            
     }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>>list = permutation(arr);
        System.out.println(list);
        
    }
}




// let's dry run 

// Initialize ArrayLists:

// resultList: an ArrayList to store all permutations.
// tempList: an ArrayList to temporarily store elements during backtracking.
// Call permutation method with the input array arr[] = {1, 2, 3}.

// Invoke backTrackHelper method with empty tempList and arr.

// **Check if tempList is of size arr.length (3 in this case). Since it's not, continue to the loop.

// Iterate over elements of arr[]:

// For i = 0:
// Add 1 to tempList.
// Recursively call backTrackHelper.
// Since tempList size is now 1, it's less than arr.length, so we continue.
// Again, iterate over elements of arr[]:
// For i = 0: tempList already contains 1, so skip it.
// For i = 1: Add 2 to tempList.
// Recursively call backTrackHelper.
// Since tempList size is now 2, it's less than arr.length, so we continue.
// Again, iterate over elements of arr[]:
// For i = 0: tempList already contains 1, so skip it.
// For i = 1: tempList already contains 2, so skip it.
// For i = 2: Add 3 to tempList.
// Recursively call backTrackHelper.
// Now, tempList size equals arr.length.
// Add a copy of tempList to resultList.
// Backtrack by removing the last element (3) from tempList.
// Backtrack by removing the last element (2) from tempList.
// Backtrack by removing the last element (1) from tempList.
// No more elements in arr[] to iterate over. The backTrackHelper method finishes.

// Print the resultList. It contains all permutations of arr[].

// Let me know if you need further clarification on any step!








// Time Complexity:

// The function backTrackHelper is called recursively for each element in the array arr[].
// At each recursive call, we iterate through the entire array arr[] to explore all possible permutations.
// Let 
// �
// n be the length of the input array arr[].
// The time complexity can be expressed as 
// �
// (
// �
// ×
// �
// !
// )
// O(n×n!).
// �
// (
// �
// )
// O(n) for iterating through the array arr[] at each recursive level.
// �
// (
// �
// !
// )
// O(n!) for generating all permutations.
// Therefore, the time complexity is factorial 
// �
// !
// n!, which grows very quickly as 
// �
// n increases.
// Space Complexity:

// The space complexity mainly comes from the recursion stack and the tempList ArrayList.
// At each recursive call, we add one element to the tempList, and the depth of recursion is at most n, where n is the length of the input array.
// Each recursive call also adds a new list to the resultList, but these lists are distinct and do not contribute significantly to the overall space complexity.
// The space complexity can be expressed as 
// �
// (
// �
// )
// O(n) for the recursion stack and 
// �
// (
// �
// )
// O(n) for the tempList.
// Therefore, the overall space complexity is 
// �
// (
// �
// )
// O(n).
// In summary, the time complexity is factorial and the space complexity is linear in terms of the length of the input array.




