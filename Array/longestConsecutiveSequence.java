import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={100,4,200,1,2,5,6};
        // int arr[]={15, 6 ,2 ,1 ,16, 4, 2, 29 ,9 ,12 ,8 ,5 ,14 ,21 ,8 ,12 ,17 ,16, 6 ,26 ,3 };
        // int arr[]={1,2,2,3,3,4,5,6};
        // int arr[]={0};
            
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        //12456100200
        
        // int x=arr[0];   
        // int c=1;
        // int l =0;
        // if(arr.length==1){
        //     l=1;
        // }
        // for(int i=1;i<arr.length;i++){
        //     // System.out.println(arr[i]+" "+x);
        //     if(arr[i]==x+1){
        //         c+=1;
                
        //     }
        //     else if(x==arr[i]){
        //         l= Math.max(c, l);
        //     }
        //     else{
                
        //         c=1;
        //     }
        //     x=arr[i];
        //    l= Math.max(c, l);
           

        // }
        // System.out.println(l);
        

        //optimize tc O(N)
        int maxLength =0;
        HashSet<Integer>h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        for(int i:h){
            if(!h.contains(i-1)){
                int len =1;
                int nextElement = i+1;
                while(h.contains(nextElement)){
                    len++;
                    nextElement++;
                }
                maxLength=Math.max(maxLength, len);
            }
        }
        System.out.println(maxLength);
    }
}
