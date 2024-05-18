import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
class Solution {
    // Function to perform zigzag level
    // order traversal of a binary tree
    public List<List<Integer>> ZigZagLevelOrder(Node root) {
       
        List<List<Integer>> result = new ArrayList<>();

       
        if (root == null) {
            return result;
        }

       
        Queue<Node> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        
        boolean leftToRight = true;

       
        while (!nodesQueue.isEmpty()) {
            
            int size = nodesQueue.size();
            // System.out.println("size : "+size);

            List<Integer> row = new ArrayList<>();
           
           
            for (int i = 0; i < size; i++) {
               
                Node node = nodesQueue.poll();
               

               
                // int index = leftToRight ? i : (size - 1 - i);
                // row.add(index, node.data);
                if (leftToRight) {
                    row.add(node.data);   //add node from beginning
                } else {
                    row.add(0, node.data); // Insert at the beginning
                }

                
                
                

               
                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }

          
            leftToRight = !leftToRight;
           
           
            result.add(row);
        }

        
        return result;
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>list = new ArrayList<>();
        if(root==null){
            return list;
        }
        


 }
public class zigzag {
    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
         // Creating a sample binary tree
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
 
         Solution solution = new Solution();
 
         // Get the zigzag level order traversal
         List<List<Integer>> result = solution.ZigZagLevelOrder(root);
 
         // Print the result
         printResult(result);
        
    }
    
}






