public class sortArray {
    public static boolean arraySort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && arraySort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6};
        System.out.println(arraySort(arr,0));
    }
}
