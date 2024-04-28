public class checkIfArraySorted {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;   //for sorted and only zero/ one times arr[i]>arr[i+1]
            }
            if(count>1){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
