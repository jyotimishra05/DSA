public class sumOfDigits {
    
    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        int ans = n%10+digitSum(n/10);
        return ans;
    }
    public static void main(String[] args) {
        int n = 38;
        int res=digitSum(n);
        
        System.out.println(res);
    }
    
}