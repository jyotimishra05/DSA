public class isPallindrome {
    public static boolean isPallindromeofString(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
        return isPallindromeofString(str.substring(1, str.length()-1));}
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPallindromeofString("carrac"));
    }
}
