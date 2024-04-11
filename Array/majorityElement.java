public class majorityElement {
    public static void main(String[] args) {
        int arr[] ={3,2,3};
       
        // for(int i=0;i<arr.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //         if(count>arr.length/2){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        int count =0;
        int cand =0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                cand =arr[i];
            }
            if(arr[i]==cand){
                count++;
            }
            else{
                count--;
            }
        }
        // Validate if the candidate is the majority element
        count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == cand ){
                count++;
            }
        }
        int ans= (count > arr.length / 2) ? cand : -1;
        System.out.println(ans);
    }
}
