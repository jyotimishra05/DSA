import java.util.Scanner;
import java.util.Stack;

public class infixtoPostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character>st = new Stack<>();
            //a+(b*d)
        for(int i=0;i<str.length();i++){
            while (!st.isEmpty()) {
                
            }
            st.push(str.charAt(i));
        }
    }
    
}
