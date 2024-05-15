import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * basicSTL
 */
public class basicSTL {

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        // Queue<Integer>q = new ArrayDeque()<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q.size());
        // System.out.println(q); //[1, 2, 3, 3, 4]
        // q.remove();   //q.poll()
        // System.out.println(q);//[2, 3, 3, 4]
        // System.out.println(q.peek());  //2    
        // System.out.println(q.element()); //2
        Queue<Integer>helper = new LinkedList<>();   
        while(q.size()>0){
            System.out.println(q.peek());
            helper.add(q.remove());
        }
        while (helper.size()>0) {
            q.add(helper.remove());
        }
    //   System.out.println(helper);
      System.out.println(q);

        

    }
}
