import java.util.ArrayList;
import java.util.Arrays;

public class PhoneNumber {
    // public static void findCombination(String up,String p){
    //     if(up.isEmpty()){
    //         // System.out.println(p);
    //         return;
    //     }
    //     int digit = up.charAt(0)-'0';
    //     // for(int i=(digit-1)*3;i<digit*3;i++){
    //         for(int i=(digit-2)*3;i<(digit-1)*3;i++){
    //         char ch = (char)('a'+i);
    //         findCombination(up.substring(1), p+ch);
    //     }
    // }
    // public static ArrayList<String> findComb(String up, String p){
    //     if(up.isEmpty()){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         // System.out.println(list);
    //         return list;
    //     }
    //     ArrayList<String> list = new ArrayList<>();
    //     int digit = up.charAt(0)-'0';
       
    //         for(int i=(digit-2)*3;i<(digit-1)*3;i++){
    //         char ch = (char)('a'+i);
    //         list.addAll(findComb(up.substring(1), p+ch));
    //     }
    //     return list;
    // }

    //Another Approach:
    static ArrayList<String>findComb(String up , String p){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>outer=new ArrayList<>();
        String keypad[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
                      // 0    1    2      3      4      5      6       7       8       9  
        String key= keypad[up.charAt(0)-'0'];

        for(int i=0;i<key.length();i++){
            outer.addAll(findComb(up.substring(1), p+key.charAt(i)));

        }
        return outer;
    }
    public static ArrayList<String> findCombinationArrayList(String s){
        ArrayList<String>res=findComb(s,"");
        return res;
    }



    public static ArrayList <String>totalPossileWords(int arr[],int n ,String p,int j){
        if(j==arr.length){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        
         ArrayList<String>outer=new ArrayList<>();
        String keypad[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String key= keypad[arr[j]];
        // System.out.println(key);
        for(int i=0;i<key.length();i++){
            outer.addAll(totalPossileWords(arr,n,p+key.charAt(i),j+1));
        }
        return outer;
    }

    static ArrayList <String> possibleWords(int a[], int N)
    {
        return totalPossileWords(a,N,"",0);
    }



    public static void main(String[] args) {
        // findCombination("2","");
        String s="23";
        if(s.isEmpty() || s==null){
            System.out.println(new ArrayList<>());
        }
        ArrayList<String>list = findCombinationArrayList(s);
        System.out.println(list);
        int a[]={2,3};
        int n=a.length;
        ArrayList<String>list1=possibleWords(a,n);
        System.out.println(list1);
        
    }
}




// public static List<String> solve(String ans, String ip) {
        
//     if(ip.isEmpty()) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add(ans);
//         return list;
//     }
    
//     int digit = ip.charAt(0) - '0';
//     int i=(digit-2)*3;
//     if(digit > 7) {
//         i+=1;
//     }
//     int len = i+3;
//     if(digit == 7 || digit == 9) {
//         len+=1;
//     }
    
//     ArrayList<String> list = new ArrayList<>();
            
//     for(; i<len; i++) {
//         char ch = (char)('a' + i);
//         list.addAll(solve(ans+ch, ip.substring(1)));
//     }
    
//     return list;
    
// }




//n be the length of the input string "23"
//each digit has let say 4 corresponding letters
//For each digit, we perform a recursive call, resulting in 4^n
  //combinations being generated in the worst case.



//   The space complexity mainly depends on the recursive calls 
// and the space required to store the resulting combinations.  

//In the worst case, there can be 4^n combination  each of length n

// Therefore, the space complexity is (4^n)*n
