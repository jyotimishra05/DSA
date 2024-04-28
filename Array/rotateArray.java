import java.util.ArrayList;
import java.util.Arrays;

public class rotateArray {
    public static void reverseArray(int arr[],int s,int e){
        System.out.println(s+" "+e);
        while (s<=e) {
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
        


    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;

        // Left rotation by one place 
        int tempVar = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=tempVar;
        System.out.println("Left rotation by one place"+Arrays.toString(arr));

        // left rotation by k places
        int k =3;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
         k= k%n;
         for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
         }
         for(int j=n-k;j<n;j++){
            arr[j]=temp[j-(n-k)];   //whatever the place you are on just subtract the base index 0,1,2

         }

         System.out.println("Left rotation by k"+Arrays.toString(arr));


         //right rotation by k 
         int nums[]={1,2,3,4,5,6,7};   //clockwise
         int n1 = nums.length;
         int d=3;
         int temp1[]=new int[n1-d];
        for(int i=0;i<temp1.length;i++){
            temp1[i]=nums[i];
        }
         
         for(int i=0;i<d;i++){
            nums[i]=nums[n1-d+i];
         }
         for(int j=d;j<n1;j++){
            nums[j]=temp1[j-d];  

         }
         System.out.println("Right rotation by k"+Arrays.toString(nums));

      //another approach
int k2=3;
int arr2[]={1,2,3,4,5,6,7};
        reverseArray(arr2,0,n-k2-1);  //1,2,3,4,5,6,7 k=3
        reverseArray(arr2,n-k2,n-1);
        reverseArray(arr2,0,n-1);
        System.out.println(Arrays.toString(arr2));


        //rotate left 
        int k3=2;
        int arr3[]={1,2,3,4,5};    //21543
        int n3=arr3.length;
        reverseArray(arr3,0,k3-1);
        reverseArray(arr3,k3,n3-1);
        reverseArray(arr3,0,n3-1);
        System.out.println(Arrays.toString(arr3));
        
    }
}
