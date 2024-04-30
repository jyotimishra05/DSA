import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class reArrangePosAndNegToAlternativePosition {
    public static void main(String[] args) {
        //Equal number of positive and negative element
        int arr[]={3,1,-2,-5,2,-4}; 
        int posIndex=0;
        int negIndex =1;
        int temp[]=new int[arr.length];
      
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                temp[posIndex]=arr[i];
                posIndex+=2;
            }

        }
        System.out.println(Arrays.toString(temp));  //[3, -2, 1, -5, 2, -4]


        // !Equal number of positive and negative element

        int nums[]={-1,2,3,4,-3,1};
        // int pos=0;
        // int neg =0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         neg++;
        //     }
        //     else{
        //         pos++;
        //     }
        // }

        // int posArray[]=new int[pos];
        // int negArray[]=new int[neg];
        // int x=0;
        // int y=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         negArray[y++]=nums[i];
        //     }
        //     else{
        //         posArray[x++]=nums[i];
        //     }
        // }

        ArrayList<Integer>pos = new ArrayList<>();  //2 3 4 1
        ArrayList<Integer>neg = new ArrayList<>(); //-1 -3
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
            
            if(neg.size()<pos.size()){
                for(int i=0;i<neg.size();i++){
                    nums[2*i]=pos.get(i);
                    nums[2*i+1]= neg.get(i);
                }
                int index = neg.size()*2;
                for(int i=neg.size();i<pos.size();i++){
                    nums[index]=pos.get(i);
                    index++;

                }


            }
            else{
                for(int i=0;i<pos.size();i++){
                    nums[2*i]=pos.get(i);
                    nums[2*i+1]= neg.get(i);
                }
                int index = pos.size()*2;
                for(int i=pos.size();i<neg.size();i++){
                    nums[index]=neg.get(i);
                    index++;

                }

            }
        

System.out.println(Arrays.toString(nums));



        // for(int list :pos){
        //     System.out.print(list+" ");
        // }
        // for(int list :neg){
        //     System.out.print(list+" ");
        // }

    }
    
}
