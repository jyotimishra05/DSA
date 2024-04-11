
import java.util.HashSet;

/**
 * longestSubstring
 */
public class longestSubstring {
    public static int longestSubstringWithoutRepeatingCharater(String s){
        int max =0;
        int apointer =0;
        int bpointer=0;
        HashSet<Character>h=new HashSet<>();
        while(bpointer<s.length()){
            if(!h.contains(s.charAt(bpointer))){
                h.add(s.charAt(bpointer));
                max=Math.max(bpointer-apointer+1,max);
                bpointer++;


            }
            else{
                h.remove(s.charAt(apointer));
                apointer++;

            }

        }
        return max;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestSubstringWithoutRepeatingCharater(s));
        
    }

   
    
}