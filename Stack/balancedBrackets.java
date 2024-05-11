import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static boolean getResult(Stack<Character>st,String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'&& !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(ch=='}'&& !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(ch==']'&& !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character>st = new Stack<>();
        System.out.println(getResult(st, str));
        
    }
}
