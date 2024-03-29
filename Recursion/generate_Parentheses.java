import java.util.ArrayList;

public class generate_Parentheses {
    public static ArrayList<String> paranthesis(int n,String p,int o,int c,int i){
        if(i==n*2){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();

        if(o<n){
            list.addAll(paranthesis(n, p+"(", o+1, c, i+1));
        }

        if(c<o){
            list.addAll(paranthesis(n, p+")", o, c+1, i+1));
        }
       return list;
    }
    public static ArrayList<String> balParanthesis(int n){
        // char arr[]=new char[n*2];
        return paranthesis(n,"",0,0,0);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<String>list= balParanthesis(n);
        System.out.println(list);
    }

}
