public class decimalToBinary {
    public static int binary(int n){
        if(n==0){
            return 0;
    }
    int ans = n%2+ 10*binary(n/2);
    return ans ;
    }
    public static void main(String[] args) {
        System.out.println(binary(10));
    }
}
