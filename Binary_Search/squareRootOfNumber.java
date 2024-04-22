public class squareRootOfNumber {
    public static int findAns(int x){
        long s =0;
        long e=x;
       
        while(s<=e){
            long mid =s+(e-s)/2;
            if(mid*mid == x){
                
                return (int)mid;
                
            }
            else if(mid*mid<x){
                s=mid+1;
              
            }
            else{
                e=mid-1;
            }
        }
        return (int)e;  //floor
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(findAns(n));
    }
}
