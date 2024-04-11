import java.util.ArrayList;

public class subSeq {
    static int count=0;
    public static void totalSubseq(String str,String s){
       

        if(str.isEmpty()){
            count++;
            System.out.print(s+" ");
            System.out.println(count);
            
           
            return;
        }
        totalSubseq(str.substring(1), s+str.charAt(0));
        totalSubseq(str.substring(1), s);
        
        

    }
    public static ArrayList<String> totalSubseqArrayList(String str,String s){
        if(str.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            
            list.add(s);
            // System.out.println("s"+list);
            return list;
        }
        ArrayList<String>left=totalSubseqArrayList(str.substring(1), s+str.charAt(0));
        ArrayList<String>right=totalSubseqArrayList(str.substring(1), s);
        // System.out.println("left"+left);
        // System.out.println("right"+right);
        left.addAll(right);
        // if(left.contains("abc")){
        //     System.out.println(true);
        // }
        return left;

    }
    public static void main(String[] args) {
        // totalSubseq("abcd","");
        // totalSubseq("aba","");
        ArrayList<String>list=totalSubseqArrayList("abc","");
        System.out.println(list);
    }
}
