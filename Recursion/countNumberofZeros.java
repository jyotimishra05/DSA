public class countNumberofZeros {
    // static int c=0;
    // public static int count(int n){
      
    //     if(n==0){
    //         return 0;
    //     }
    //     int rem = n%10;
    //     if(rem%10==0){
    //         c++;
    //     }
    //     count(n/10);
    //     return c;
    // }
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem ==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
    public static int count(int n){
        return helper(n,0);

    }
    public static void main(String[] args) {
        System.out.println(count(1201203020));
    }
}
