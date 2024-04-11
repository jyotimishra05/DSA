public class gcd {
    public static int gcdNumber(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        int ans = gcdNumber(b, a%b);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(gcdNumber(48,18));
    }
}
