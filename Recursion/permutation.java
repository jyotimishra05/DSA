import java.util.ArrayList;

public class permutation {
    public static ArrayList<String>permutationOfStringInArray(String up, String p){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;

            
        }

        ArrayList<String>ans = new ArrayList<>();
        char ch = up.charAt(0);

     for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i,p.length());
            ans.addAll(permutationOfStringInArray(up.substring(1),f+ch+s));
        }
        return ans ;

    }
    // public static void permutationOfString(String up,String p){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     for(int i=0;i<=p.length();i++){
    //         String f = p.substring(0,i);
    //         String s= p.substring(i,p.length());
    //         permutationOfString(up.substring(1),f+ch+s);
    //     }

    // }
    public static int permutationOfStringCount(String up,String p ){
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }
        int c=0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i,p.length());
            c=c+permutationOfStringCount(up.substring(1),f+ch+s);
        }
        return c;
    }
    public static void main(String[] args) {
        // permutationOfString("abc","");
        System.out.println(permutationOfStringCount("abc",""));
        ArrayList<String>list = permutationOfStringInArray("abc","");
        System.out.println(list);
    }
}
