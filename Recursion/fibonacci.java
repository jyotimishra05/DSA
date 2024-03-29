public class fibonacci {
    public static int powerOfnum(int n,int x){
        if(x<0){
            return -1;
        }
        if(x==0){
            return 1;
        }
        int ans = n*powerOfnum(n, x-1);
        return ans;
    }
    public static void main(String[] args) {
        int n =2;
        int x=4;
       int res= powerOfnum(n,x);
       System.out.println((res));
    }
}
