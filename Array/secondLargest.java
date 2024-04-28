public class secondLargest {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,8,7};
        // int max = Integer.MIN_VALUE;
        // int secondMax = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     max = Math.max(max,arr[i]);

        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=max){
        //         secondMax= Math.max(secondMax,arr[i]);
        //     }
            
            
        // }

        int max = arr[0];
        int secondMax =-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];

            }
           else if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }

        System.out.println(max + " " +secondMax);

        //second smallest

        int min = arr[0];
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println(min+ " "+smin);
    }
    
}
