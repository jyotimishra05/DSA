import java.util.Arrays;

public class reverseOfArray {
    static int num=0;
    public static int reverseofNumber(int n){
        
        if(n==0){
            return 0;
        }
        num=num*10+n%10;
       
        reverseofNumber(n/10);
        return num;
    }
    // public static int[] reverseFn(int arr[]){
        
    //    for(int i=0;i<arr.length/2;i++){
    //         int n1=arr[i];
    //         int n2=arr[arr.length-1-i];
    //       arr[i]=n2;
    //       arr[arr.length-1-i]=n1;


    //    }

    //    return arr;
    // }
    public static void main(String[] args) {
    //    int arr[]={1,2,3,4,5};
    //    System.out.println(Arrays.toString(reverseFn(arr)));
    System.out.println(reverseofNumber(12345));
    }
}
// int a= new int[]