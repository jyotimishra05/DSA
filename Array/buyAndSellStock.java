import java.util.ArrayList;



public class buyAndSellStock {

    public static ArrayList<ArrayList<Integer>>findArrayList(int arr[]){
        ArrayList<ArrayList<Integer>>li = new ArrayList<>();
        int profit =0;
        int j=0;
        
        int buy=arr[j]; 
        for(int i=1;i<arr.length;i++){
            
            int diff= arr[i]-buy;
            if(diff>0){
                
                ArrayList<Integer>list= new ArrayList<>();
                list.add(j);
                list.add(i);
                li.add(list);
            }
            profit=Math.max(diff, profit);
            // System.out.println(profit);
            if(arr[i]<buy){
                buy=arr[i];
                j=i;
            }
            // buy=Math.min(arr[i], buy);
        }
      
        return li;
         
        
    }
    public static void main(String[] args) {
        int arr[]={100,180,260,310,40,535,695};
        //you have to keep track for min just before the current element buy should always < sell
        int profit =0;
        int buy=arr[0];  //loss if you buy ans sell same day 0 profit
        for(int i=1;i<arr.length;i++){
            
            int diff= arr[i]-buy;
            // if(diff>0){
            //     System.out.println(arr[i]+" "+buy);
            // }
            profit=Math.max(diff, profit);
         
            buy=Math.min(arr[i], buy);
        }
        System.out.println(profit);

        ArrayList<ArrayList<Integer>>li=findArrayList(arr);
        for(ArrayList<Integer> ans: li){
            System.out.println("ans"+ans);
        }
    }
}
