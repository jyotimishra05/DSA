public class reverseString {
    public static String reverse(String str){
        
        

        if(str.isEmpty()){
            return str;
        }
        String s= reverse(str.substring(1))+str.charAt(0);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(reverse("i.like.this.program.very.much"));
    }
}
