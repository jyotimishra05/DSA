/**
 * skipChar
 */
public class skipChar {
    // public static void removeChar(String str,String s){
    //     if(str.isEmpty()){
    //         System.out.println(s);
    //         return;
    //     }
    //     char ch = str.charAt(0);
    //     if(ch=='a'){
    //         removeChar(str.substring(1), s);
    //     }
    //     else{
    //         removeChar(str.substring(1), s+ch);
    //     }

    // }
    public static String containStringApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return containStringApple(s.substring(5));
        }
        else{
            return s.charAt(0)+ containStringApple(s.substring(1));
        }
    }
    public static String containStringAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return containStringAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+containStringAppNotApple(s.substring(1));
        }
    }

    public static void main(String[] args) {
        // String str="abbacd";
        // removeChar(str,"");
        String res=containStringApple("iamapplefruit");
        System.out.println(res);
        System.out.println(containStringAppNotApple("wecanseeinappfriutnameapple"));
      
    }
}