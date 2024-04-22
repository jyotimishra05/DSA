public class smallesLetter {
    public static char nextGreatestLetter(char[] arr, char target) {
        int s=0;
        int e=arr.length-1;
       

        while(s<=e){
            int mid = s+(e-s)/2;
        
            if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return arr[s%arr.length];
        
    }
    public static void main(String[] args) {
        char []ch={'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(ch,target));
        
    }
    
}
