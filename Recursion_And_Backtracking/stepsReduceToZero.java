public class stepsReduceToZero {
    public static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helper(n/2, count+1);  
        }
        else{
            return helper(n-1, count+1);
        }
    }
    public static int countSteps(int n){
        return helper(n,0);
    }
    public static void main(String[] args) {
        int n=14;
        System.out.println(countSteps(n));
    }
}
