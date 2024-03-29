import java.util.ArrayList;

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
    public static ArrayList<String> findComb(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            // System.out.println(list);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
       
            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch = (char)('a'+i);
            list.addAll(findComb(up.substring(1), p+ch));
        }
        return list;
    }
    public static ArrayList<String> findCombinationArrayList(String s){
        ArrayList<String>res=findComb(s,"");
        return res;
    }
    public static void main(String[] args) {
        // findCombination("2","");
        ArrayList<String>list = findCombinationArrayList("23");
        System.out.println(list);
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