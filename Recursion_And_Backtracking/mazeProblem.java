import java.util.ArrayList;

/**
 * mazeProblem
 */
//3 2 1

public class mazeProblem {
    static int totalWays(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = totalWays(r-1,c);
        int right = totalWays(r, c-1);
        return left+right;
    }
    static void totalPath(String p,int r ,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            totalPath(p+'D', r-1, c);
        }
        if(c>1){
            totalPath(p+'R', r, c-1);
        }

    }
static ArrayList<String>totalPaths(String s, int r,int c){
    if(r==1 && c==1){
        ArrayList<String>res = new ArrayList<>();
        res.add(s);
        return res;
    }
    ArrayList<String>list = new ArrayList<>();
      if(r>1){
            list.addAll(totalPaths(s+"D", r-1, c));
          }
   if(c>1){
            list.addAll(totalPaths(s+"R", r, c-1));
          }

    return list;

}

    public static void main(String[] args) {
        // int res=totalWays(3, 3);
        // System.out.println(res);
        // totalPath("", 3, 3);
        ArrayList<String>list=totalPaths("", 3, 3);
        System.out.println(list);
        
    }
}