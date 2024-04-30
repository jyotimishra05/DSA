import java.util.ArrayList;

public class leader {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        ArrayList<Integer>li= new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxi){
                li.add(arr[i]);
                maxi=Math.max(maxi, arr[i]);
            }
        }
        
        
        
       
        for(int res :li){
            System.out.println(res);
        }


        
        // Input: arr = [17,18,5,4,6,1]
        // Output: [18,6,6,6,1,-1]    
        // int max =-1;
        // int x = Integer.MIN_VALUE;
        // for(int i=arr.length-1;i>=0;i--){
        //         max=Math.max(max,x);
        //         x=arr[i];
        //         arr[i]=max;

        // }
    }
}
